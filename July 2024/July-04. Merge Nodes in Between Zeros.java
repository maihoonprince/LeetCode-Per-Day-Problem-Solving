July-04. Merge Nodes in Between Zeros :
2181.


class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(), cur = dummy;
        head = head.next;
        int sum = 0;
        while(head != null) {
            if(head.val == 0) {
                cur.next = new ListNode(sum);
                cur = cur.next;
                sum = 0;
            } 
            sum += head.val;
            head = head.next;
        }
        return dummy.next;
    }
}
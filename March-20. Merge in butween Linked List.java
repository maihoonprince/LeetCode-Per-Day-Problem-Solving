March-20. Merge in butween Linked List :
1669.


class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp = list1, bn = null, an = null;
        int idx = 0;
        while(temp != null){
            if(idx == a-1) an = temp;
            else if(idx == b+1) bn = temp;
            temp = temp.next;
            idx++;
        }
        an.next = list2;
        getTail(list2).next = bn;
        return list1;
    }
    public ListNode getTail(ListNode node){
        while(node.next != null) node = node.next;
        return node;
    }
}
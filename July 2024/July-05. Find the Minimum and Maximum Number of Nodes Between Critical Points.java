July-05. Find the Minimum and Maximum Number of Nodes Between Critical Points :
2058.


class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode pre = head;
        ListNode cur = head.next;
        int[] ans = {-1, -1};
        int prePosition = -1, curPosition = -1, firstPosition = -1, position = 0;
        while (cur.next != null) {
            if ((cur.val < pre.val && cur.val < cur.next.val) || (cur.val > pre.val && cur.val > cur.next.val)) {
                // local
                prePosition = curPosition;
                curPosition = position;
                if (firstPosition == -1) {
                    firstPosition = position;
                }
                if (prePosition != -1) {
                    if (ans[0] == -1) ans[0] = curPosition - prePosition;
                    else ans[0] = Math.min(ans[0], curPosition - prePosition);
                    ans[1] = position - firstPosition;
                }
            }
            
            position++;
            pre = cur;
            cur = cur.next;
        }
        return ans;
    }
}
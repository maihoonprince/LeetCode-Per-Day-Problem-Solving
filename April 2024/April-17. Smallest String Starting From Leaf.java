April-17. Smallest String Starting From Leaf:
988.



class Solution {
    public String smallestFromLeaf(TreeNode root) {
        recur(root, new StringBuilder());
        return ans;
    }
    private String ans = "~";
    private void recur(TreeNode node, StringBuilder holder) {

        if (node != null) {
            holder.append((char)('a' + node.val));

            if (node.left == null && node.right == null) {
                holder.reverse();
                String str = holder.toString();
                holder.reverse();

                if (str.compareTo(ans) < 0) {
                    ans = str;
                }
            }
            recur(node.left, holder);
            recur(node.right, holder);
            holder.deleteCharAt(holder.length() - 1);
        }
    }
}
April-16. Add one row to Tree :
623.


class Solution {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        return helper(root, depth, 1, val, true, false);
    }
    
    private TreeNode helper(TreeNode root, int depth, int d, int val, boolean left, boolean right) {
        if (d == depth) {
            TreeNode node = new TreeNode(val);
            if (left) {
                node.left = root;
            } else {
                node.right = root;
            }
            return node;
        }
        if (root == null) return null;
        
        root.left = helper(root.left, depth, d + 1, val, true, false);
        root.right = helper(root.right, depth, d + 1, val, false, true);
        
        return root;
    }
}
May-17. Delete Leaves With a Given Value :
1325.


class Solution {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if(root != null){
            root.left = removeLeafNodes(root.left, target);
            root.right = removeLeafNodes(root.right, target);
            if(root.left == null && root.right == null && root.val == target){
                return null;
            }
            return root;
        }
        return null;
    }
}
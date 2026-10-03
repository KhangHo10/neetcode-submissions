/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public TreeNode invertTree(TreeNode root) {
        // Could be null
        if (root == null) return root;

        dfs(root);

        return root;

    }

    public void dfs(TreeNode node) {
        if (node == null) return;
        TreeNode temp;

        dfs(node.left);
        dfs(node.right);
        if (node.left != null || node.right != null) {
            temp = node.left;
            node.left = node.right;
            node.right = temp;
        }
    }
}

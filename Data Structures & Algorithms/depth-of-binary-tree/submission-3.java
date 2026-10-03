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
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        return dfs(root);
    }

    public int dfs(TreeNode node) {
        if (node == null) return 0;

        int c1 = dfs(node.left) + 1;
        int c2 = dfs(node.right) + 1;

        return Math.max(c1, c2);
    }
}

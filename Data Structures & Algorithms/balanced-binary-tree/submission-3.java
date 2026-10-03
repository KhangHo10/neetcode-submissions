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
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;

        return dfs(root) != -1;
    }

    public int dfs(TreeNode node) {
        if (node == null) return 0;

        int c1 = dfs(node.left);
        if (c1 == -1) return -1;
        int c2 = dfs(node.right);
        if (c2 == -1) return -1;

        if (Math.abs(c1 - c2) > 1) return -1;

        return Math.max(c1, c2) + 1;
    }
}

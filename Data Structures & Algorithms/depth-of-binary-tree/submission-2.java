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
        int maxDepth = dfs(root);
        return maxDepth;
    }

    public int dfs(TreeNode root) {
        if (root.left == null && root.right == null) {
            return 1;
        }

        int count = 0;
        int max = 0;

        if (root.left != null) {
            count = 1 + dfs(root.left); 
            max = Math.max(count, max);
            count = 0;
        }
        if (root.right != null) {
            count = 1 + dfs(root.right); 
            max = Math.max(count, max);
            count = 0;
        }
        return max;
    }
}

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
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return diameter;
    }

    public int dfs(TreeNode node) {
        if (node == null) return 0;

        int c1 = dfs(node.left);
        int c2 = dfs(node.right);

        diameter = Math.max(diameter, c1 + c2);

        return Math.max(c1, c2) + 1;
    }

    //          1
    //      2       3
    //  4       5 6     7
}

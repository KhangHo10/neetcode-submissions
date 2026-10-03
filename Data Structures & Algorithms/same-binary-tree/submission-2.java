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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return dfs(p, q) != -1;
    }

    public int dfs(TreeNode nodeA, TreeNode nodeB) {
        if (nodeA == null && nodeB == null) return 1;
        if ((nodeA != null && nodeB == null) || (nodeA == null && nodeB != null)) return -1;
        if (nodeA.val != nodeB.val) return -1;

        int c1 = dfs(nodeA.left, nodeB.left);
        int c2 = dfs(nodeA.right, nodeB.right);

        if (c1 == 1 && c2 == 1) {
            return 1;
        }
        return -1;
    }
}

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
    public int goodNodes(TreeNode root) {
        HashSet<TreeNode> holder = new HashSet<>();

        dfs(root, holder, root.val);

        return holder.size();
    }

    public void dfs(TreeNode node, HashSet<TreeNode> holder, int curr) {
        if (node == null) return;

        if (node.val >= curr) holder.add(node); 

        dfs(node.left, holder, Math.max(curr, node.val));
        dfs(node.right, holder, Math.max(curr, node.val));

        return;
    }
}

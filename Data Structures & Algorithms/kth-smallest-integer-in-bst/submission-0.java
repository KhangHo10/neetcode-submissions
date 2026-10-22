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
    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> holder = new PriorityQueue<>();

        dfs(root, holder);

        for (int i = 0; i < k-1; i++) {
            holder.poll();
        }

        return holder.peek();
    }

    public void dfs(TreeNode node, PriorityQueue<Integer> holder) {
        if (node == null) return;

        if (!holder.contains(node.val)) holder.add(node.val);

        dfs(node.left, holder);
        dfs(node.right, holder);
    }
}

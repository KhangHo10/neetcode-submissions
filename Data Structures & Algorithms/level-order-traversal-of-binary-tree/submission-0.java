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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();

        Queue<TreeNode> queue = new ArrayDeque<>();
        List<List<Integer>> holder = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        queue.offer(root);

        while (!queue.isEmpty()) {
            int currSize = queue.size();

            for (int i = 0; i < currSize; i++) {
                TreeNode curr = queue.remove();
                temp.add(curr.val);

                if (curr.left != null) {
                    queue.offer(curr.left);
                }

                if (curr.right != null) {
                    queue.offer(curr.right);
                }
            }
            holder.add(temp);
            temp = new ArrayList<>();
        }

        return holder;
    }
}

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
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) return new ArrayList<>();
        Queue<TreeNode> holder = new ArrayDeque<>();
        List<Integer> answer = new ArrayList<>();

        holder.offer(root);

        while (!holder.isEmpty()) {
            int size = holder.size();

            for (int i = 0; i < size; i++) {
                TreeNode curr = holder.poll();

                if (curr.left != null) holder.offer(curr.left);
                if (curr.right != null) holder.offer(curr.right);

                if (i != size - 1) {
                    continue;
                }
                answer.add(curr.val);
            }
        }

        return answer;
    }
}

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
        if(root == null) return null;
        Queue<TreeNode> holder = new ArrayDeque<>();
        holder.offer(root);
        TreeNode curr = null;

        while(!holder.isEmpty()) {
            curr = holder.poll();
            TreeNode temp = curr.left;

            curr.left = curr.right;
            curr.right = temp;
            
            if(curr.left != null) {
                holder.offer(curr.left);
            }
            if(curr.right != null) {
                holder.offer(curr.right);
            }
        }

        return root;   
    }
}

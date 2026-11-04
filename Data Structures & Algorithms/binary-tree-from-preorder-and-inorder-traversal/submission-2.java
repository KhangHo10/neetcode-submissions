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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> holder = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            holder.put(inorder[i], i);
        }

        return buildSubTree(holder, preorder, 0, inorder.length-1, 0);
    }

    public TreeNode buildSubTree(HashMap<Integer, Integer> holder, int[] preorder, int left, int right, int index) {
        if (index >= holder.size()) return null;
        if (left > right) return null;

        int currRoot = preorder[index];

        TreeNode root = new TreeNode(currRoot);

        int mid = holder.get(currRoot);

        root.left = buildSubTree(holder, preorder, left, mid-1, index+1);
        root.right = buildSubTree(holder, preorder, mid+1, right, index+mid-left+1);

        return root;
    }
}

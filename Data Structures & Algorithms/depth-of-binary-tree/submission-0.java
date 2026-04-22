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
         if(root == null){
            return 0;
        }

        int depth = 1;

        int leftDepth = maxDepthNode(root.left, depth);
        int rightDepth = maxDepthNode(root.right, depth);

        return Math.max(leftDepth, rightDepth);
    }

    int maxDepthNode(TreeNode node, int currentDepth){

        if(node == null){
            return currentDepth;
        }

        int leftDepth = maxDepthNode(node.left, currentDepth+1);
        int rightDepth = maxDepthNode(node.right, currentDepth+1);

        return Math.max(leftDepth, rightDepth);

    }



}

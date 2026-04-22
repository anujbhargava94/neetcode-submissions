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


     int maxDiameter = Integer.MIN_VALUE;

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return maxDiameter;    
    }

    int dfs(TreeNode node){
        if(node == null) return 0;
        int leftMax = dfs(node.left);
        int rightMax = dfs(node.right);

        maxDiameter = Math.max(leftMax+rightMax, maxDiameter);
        return Math.max(leftMax+1,rightMax+1);
    }
}

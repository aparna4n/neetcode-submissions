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
     public boolean dfs(TreeNode node, int minm,int maxm){
        if(node==null) return true;
        boolean isValid=node.val<maxm && node.val>minm?true:false;
        return isValid && dfs(node.left,minm,node.val) && dfs(node.right,node.val,maxm);

    }
    public boolean isValidBST(TreeNode root) {
        return dfs(root,Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}

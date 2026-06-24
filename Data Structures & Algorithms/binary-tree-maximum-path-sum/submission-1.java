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
    public int maxTillRoot(TreeNode node){
        if(node==null) return 0;
        if(node.left==null && node.right==null){
            return Math.max(0,node.val);
        }
        int ans=node.val;
        int left=maxTillRoot(node.left);
        int right=maxTillRoot(node.right);
        int leftMax=Math.max(left+ans,ans);
        int rightMax=Math.max(right+ans,ans);
        ans=Math.max(ans,leftMax);
        ans=Math.max(ans,rightMax);
        ans=Math.max(ans,0);
        return ans;
    }
    int maxm;
    public void dfs(TreeNode node){
        if(node==null) return;
        int left=maxTillRoot(node.left);
        int right=maxTillRoot(node.right);
        int ans=node.val;
        ans=Math.max(ans,left+ans);
        ans=Math.max(ans,right+ans);
        maxm=Math.max(maxm,ans);
        dfs(node.left);
        dfs(node.right);

    }
    public int maxPathSum(TreeNode root) {
        maxm=Integer.MIN_VALUE;
        int ans=maxTillRoot(root);
        dfs(root);
        return maxm;
    }
}

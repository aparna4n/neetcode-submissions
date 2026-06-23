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
    public int maximumTillRoot(TreeNode node){
        if(node==null) return 0;
        if(node.left==null && node.right==null) {
            int val=Math.max(node.val,0);
            System.out.println("node val :"+ node.val + " ans:" + val);
            return val;
        }
        int ans=node.val;
        int left=maximumTillRoot(node.left);
        int right=maximumTillRoot(node.right);
        int leftMax=Math.max(ans,ans+left);
        int rightMax=Math.max(ans,ans+right);
        ans=Math.max(leftMax,ans);
        ans=Math.max(rightMax,ans);
        ans=Math.max(0,ans);
        System.out.println("node val :"+ node.val + " ans:" + ans);
        return ans;

    }
    int maxm;
    public void dfs(TreeNode node){
        if(node==null) return ;
        int left=maximumTillRoot(node.left);
        int right=maximumTillRoot(node.right);
        int ans=node.val;
        ans=Math.max(ans,left+ans);
        ans=Math.max(ans,right+ans);
        maxm=Math.max(maxm,ans);
        dfs(node.left);
        dfs(node.right);

    }
    public int maxPathSum(TreeNode root) {
        maxm=Integer.MIN_VALUE;
        int ans= maximumTillRoot(root);
        dfs(root);
        return maxm;
    }
}

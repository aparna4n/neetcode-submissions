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
    public int dfs(TreeNode node,int maxm){
        if(node==null) return 0;
        //check for current node
        int ans=0;
        if(node.val>=maxm){
            ans++;
        }
        ans+=dfs(node.left,Math.max(maxm,node.val)) + 
        dfs(node.right,Math.max(maxm,node.val));
        return ans;
    }
    public int goodNodes(TreeNode root) {
        return dfs(root,Integer.MIN_VALUE);

    }
}

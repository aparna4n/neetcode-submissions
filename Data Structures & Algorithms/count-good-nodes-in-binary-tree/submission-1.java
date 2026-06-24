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
    public int check(TreeNode node,int maxm){
        if(node==null) return 0;
        int ans=0;
        if(node.val>=maxm){
            ans++;
        }
        ans+=check(node.left,Math.max(maxm,node.val))+check(node.right,Math.max(maxm,node.val));
        return ans;
    }
    public int goodNodes(TreeNode root) {
        return check(root,Integer.MIN_VALUE);
    }
}

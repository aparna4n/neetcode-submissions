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
    public boolean check(TreeNode ref,TreeNode node){
        if(ref==null && node==null) return true;
        if(ref==null || node==null) return false;
        if(ref.val!=node.val) return false;
        return check(ref.left,node.left) && check(ref.right,node.right);
    } 
    public boolean dfs(TreeNode ref,TreeNode node){
        if(ref==null && node==null) return true;
        if(ref==null || node==null) return false;
        boolean ans=false;
        if(ref.val==node.val){
            ans=ans|| check(ref,node);
        }
        if(ans) return ans;
            ans=ans||dfs(ref.left,node) || dfs(ref.right,node);
        
        return ans;
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return dfs(root,subRoot);
    }
}

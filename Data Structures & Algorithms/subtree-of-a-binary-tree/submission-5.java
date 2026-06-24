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
    public boolean checkSame(TreeNode node,TreeNode sub){
        if(node==null && sub==null) return true;
        if(node==null || sub ==null) return false;
        return node.val==sub.val && checkSame(node.left,sub.left) && checkSame(node.right,sub.right);
    }
    public boolean check(TreeNode node,TreeNode sub){
        if(node==null && sub == null) return true;
        if(node==null || sub==null) return false;
        boolean ans=false;
        if(node.val==sub.val){
            ans=checkSame(node,sub);   
        }
            ans=ans|| check(node.left,sub);
            ans=ans|check(node.right,sub);
        return ans;
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return check(root,subRoot);
    }
}

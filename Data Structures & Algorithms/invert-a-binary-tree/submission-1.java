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

    public void invert(TreeNode node){
        if(node==null) return ;
        TreeNode left=node.left;
        TreeNode right=node.right;
        node.left=right;
        node.right=left;
        if(node.left!=null){
            invert(node.left);
        }
        if(node.right!=null){
            invert(node.right);
        }
    }
    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }
}

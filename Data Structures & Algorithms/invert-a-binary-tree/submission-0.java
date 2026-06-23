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
    public TreeNode invert(TreeNode node){
       if(node==null) return null;
       TreeNode leftSub=node.left;
       TreeNode rightSub=node.right;
       node.left=invert(rightSub);
       node.right=invert(leftSub);
       return node;
    }
    public TreeNode invertTree(TreeNode root) {
        return invert(root);
    }
}

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
    public TreeNode lca(TreeNode node,TreeNode p, TreeNode q){
        if(node==null) return null;
        if(node.val==p.val || node.val==q.val) return node;
        if(node.val>p.val && node.val>q.val) return lca(node.left,p,q);
        if(node.val<p.val && node.val < q.val) return lca(node.right,p,q);
        return node;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return lca(root,p,q);
    }
}

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
    PriorityQueue<Integer> pq=new PriorityQueue<>();
    public void dfs(TreeNode node){
        if(node==null) return;
        pq.add(node.val);
        dfs(node.left);
        dfs(node.right);
    }
    public int kthSmallest(TreeNode root, int k) {
        dfs(root);
        int last=-1;
        while(pq.size()>0 && k>0){
            last=pq.poll();
            k--;
        }
        return last;
    }
}

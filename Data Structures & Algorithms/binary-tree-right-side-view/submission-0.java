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
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null) return new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();

        q.add(root);
        q.add(null);
        Integer last=root.val;
        List<Integer> ans=new ArrayList<>();
        while(q.size()>1){
            TreeNode curr=q.poll();
            if(curr==null){
                ans.add(last);
                q.add(null);
                continue;
            }
            last=curr.val;
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }
        ans.add(last);
        return ans;

    }
}

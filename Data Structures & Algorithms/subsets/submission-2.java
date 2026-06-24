class Solution {
    public void helper(int[] nums,int index,List<Integer> curr,List<List<Integer>> res){
        if(index>=nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        //select the curr ele
        curr.add(nums[index]);
        helper(nums,index+1,curr,res);
        curr.remove(curr.size()-1);

        helper(nums,index+1,curr,res);
    }
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        List<Integer> curr=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        helper(nums,0,curr,res);
        return res;
        
    }
}

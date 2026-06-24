class Solution {
    int n;
    public void combinationSum(int[] nums,int index,List<Integer> curr,List<List<Integer>> res,int target){
        if(target==0){
            res.add(new ArrayList<>(curr));
            return;
        }
        if(target<0 || index>=n) return ;

        //add the curr ele
        curr.add(nums[index]);
        combinationSum(nums,index,curr,res,target-nums[index]);
        curr.remove(curr.size()-1);
        combinationSum(nums,index+1,curr,res,target);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        n=nums.length;
        List<Integer> curr=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        combinationSum(nums,0,curr,res,target);
        return res;

    }
}

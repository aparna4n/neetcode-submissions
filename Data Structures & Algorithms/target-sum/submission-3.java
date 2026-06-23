class Solution {
    int[][] dp;
    public int findTargetSumWaysHelper(int[] nums,int index,int target){
        if(index>=nums.length){
            if(target==0) return 1;
            else return 0;
        }
        int count=0;
        //add the curr 
        count+=findTargetSumWaysHelper(nums,index+1,target-nums[index]);
        //subtract 
        count+=findTargetSumWaysHelper(nums,index+1,target+nums[index]);

        return count;
    }
    public int findTargetSumWays(int[] nums, int target) {
        return findTargetSumWaysHelper(nums,0,target);
    }
}

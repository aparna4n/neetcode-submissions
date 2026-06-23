class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int totalSum=0;
        for(int nn:nums){
            totalSum+=nn;
        }
        if(totalSum%2!=0) return false;
        int target=totalSum/2;
        return dfs(nums,0,target);
    }
    public boolean dfs(int[] nums,int index,int target){
        if(target==0) return true;
        if(index>=nums.length) return false;
        if(target<0) return false;
        boolean curr=false;
        //select the curr 
        curr=dfs(nums,index+1,target-nums[index])||dfs(nums,index+1,target);
        return curr;
        
    }
}

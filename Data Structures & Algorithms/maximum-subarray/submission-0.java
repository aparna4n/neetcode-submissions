class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        //kadane's algo
        int ans=nums[0];
        int curr=nums[0];
        int prev=nums[0];
        for(int i=1;i<n;i++){
            curr=Math.max(nums[i],prev+nums[i]);
            ans=Math.max(curr,ans);
            prev=curr;
        }
        return ans;
    }
}

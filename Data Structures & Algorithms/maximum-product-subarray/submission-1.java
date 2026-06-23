class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        int[] dpp=new int[n];
        dp[0]=nums[0];
        dpp[0]=nums[0];
        if(n==1) return dp[0];
        int ans=0;
        for(int i=1;i<n;i++){
            dp[i]=Math.max(Math.max(nums[i]*dp[i-1], nums[i]* dpp[i-1]),nums[i]);
            dpp[i]=Math.min(Math.min(nums[i]*dp[i-1], nums[i]* dpp[i-1]),nums[i]);
            ans=Math.max(ans,dp[i]);
        }
        return ans;
    }
}

class Solution {
    public int dfs(int[] nums,int startIdx,int endIdx){
        int m=endIdx-startIdx+1;
        int[] dp=new int[m+1];
        dp[0]=0;
        dp[1]=nums[startIdx];
        dp[2]=Math.max(nums[startIdx],nums[startIdx+1]);
        for(int i=3;i<m+1;i++){
            dp[i]=Math.max(dp[i-2]+nums[startIdx+i-1],dp[i-1]);
        }
        return dp[m];
    }
    public int rob(int[] nums) {
       int n=nums.length;
       if(n==0) return 0;
       if(n==1) return nums[0];
       if(n==2) return Math.max(nums[0],nums[1]);
       return Math.max(dfs(nums,0,n-2),dfs(nums,1,n-1));

    }
}

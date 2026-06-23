class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] prev=new int[n];
        Arrays.fill(prev,1);
        for(int i=n-2;i>=0;i--){
            prev[i]=prev[i+1]*nums[i+1];
        }
        int currProd=1;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            int left=prev[i];
            int right=currProd;
            ans[i]=left*right;
            currProd*=nums[i];
        }
        return ans;
    }
}  

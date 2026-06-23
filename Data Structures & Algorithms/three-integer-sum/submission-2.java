class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int lo=i+1,hi=n-1;
           
            while(lo<hi){
                int sum = nums[i] + nums[lo] + nums[hi];
                if(sum==0){
                    ans.add(Arrays.asList(nums[i],nums[lo],nums[hi]));
                                       // skip duplicates
                    while (lo < hi && nums[lo] == nums[lo + 1]) lo++;
                    while (lo < hi && nums[hi] == nums[hi - 1]) hi--;
                    lo++;hi--;
                }
                else if(sum<0){
                    lo++;
                }else{
                    hi--;
                }
            }
        }
        return ans;
    }
}

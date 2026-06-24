class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int lo=0,hi=n-1;
        while(lo<hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]<target){
                lo=mid+1;
            }else{
                hi=mid;
                }
            
        }
        if(nums[lo]==target) return lo;
        else return -1;
        
    }
}

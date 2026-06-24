class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        boolean isRotated=false;
        if(nums[0]>nums[n-1]) isRotated=true;
        int lo=0,hi=n-1;
        if(isRotated){
            while(lo<hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]<nums[0]){
                hi=mid;
            }else{
                lo=mid+1;
            }
        }
        return nums[lo];
        }
        else return nums[0];

    }
}

class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        if(n==1) return (nums[0]==target?0:-1);
        int lo,hi;
        if(nums[n-1]>nums[0]){
            //not rotated
            if(target<nums[0] || target>nums[n-1]) return -1;
            if(target==nums[0]) return 0;
            if(target==nums[n-1]) return n-1;
             lo=0;
             hi=n-1;
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
        }else{
            //is rotated
            //first find the partition
            lo=0;hi=n-1;
            while(lo<hi){
                int mid=lo+(hi-lo)/2;
                if(nums[mid]>=nums[0]){
                    lo=mid+1;
                }else{
                    hi=mid;
                }
            }
            int lowest=lo;
            if(nums[lowest]>target || nums[lowest-1]<target) return -1;
            if(target>=nums[0]){
                lo=0;hi=lowest-1;
            }else{
                lo=lowest;hi=n-1;
            }
                         while(lo<hi){
                int mid=lo+(hi-lo)/2;
                if(nums[mid]<target){
                    lo=mid+1;
                }else{
                    hi=mid;
                }
             }
             if(nums[lo]==target) return lo;
        }
        return -1;
    }

}

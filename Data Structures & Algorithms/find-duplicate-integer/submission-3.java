class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        int i=0;
        
        while(i<n){
            if(nums[i]!=i+1){
                int correct=nums[i]-1;

                if(nums[i]==nums[correct]){
                    return nums[i];
                }
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }else{
                i++;
            }
            
        }
        return -1;
    }
}

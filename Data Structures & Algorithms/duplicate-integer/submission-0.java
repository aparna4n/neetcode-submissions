class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(mp.containsKey(nums[i])) return true;
            mp.put(nums[i],1);
        }
        return false;
    }
}
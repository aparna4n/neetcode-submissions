class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        Set<Integer> numSet=new HashSet<>();
        for(int num:nums){
            numSet.add(num);
        }
        int maxLen=0;
        for(int num:numSet){
            if(!numSet.contains(num-1)){
                int len=1;
                while(numSet.contains(num+len)){
                    len++;
                }
                maxLen=Math.max(len,maxLen);
            }
        }
        return maxLen;
    }
}

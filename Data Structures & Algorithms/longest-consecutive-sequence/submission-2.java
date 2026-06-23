class Solution {
    public int longestConsecutive(int[] nums) {
      int n=nums.length;
      int maxLen=0,ans=-1;
      Set<Integer> numSet=new HashSet<>();
      for(int m:nums){
        numSet.add(m);
      }
      for(int curr:numSet){
        if(!numSet.contains(curr-1)){
            int len=1;
            while(numSet.contains(curr+len)){
                len++;
            }
            maxLen=Math.max(maxLen,len);
        }

      }
      return maxLen;

    }
}

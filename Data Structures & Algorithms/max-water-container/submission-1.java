class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int lo=0,hi=n-1;
        int ans=0;
        while(lo<hi){
            int curr=Math.min(heights[lo],heights[hi])*(hi-lo);
            ans=Math.max(ans,curr);
            if(heights[lo]<heights[hi]){
                lo++;
            }else{
                hi--;
            }
        }
        return ans;
    }
}

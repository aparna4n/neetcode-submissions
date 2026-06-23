class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int res=0;
        int lo=0,hi=n-1;
        while(lo<hi){
            int area=Math.min(heights[lo],heights[hi])*(hi-lo);
            res=Math.max(res,area);
            if(heights[lo]<=heights[hi]){
                lo++;
            }else{
                hi--;
            }

        }
        return res;
    }
}

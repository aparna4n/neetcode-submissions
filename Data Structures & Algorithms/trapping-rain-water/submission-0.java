class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int res=0;
        int lo=0,hi=n-1;
        int leftMax=height[lo],rightMax=height[hi];
        while(lo<hi){
            if(leftMax<rightMax){
                lo++;
                leftMax=Math.max(leftMax,height[lo]);
                res+=leftMax-height[lo];
            }else{
                hi--;
                rightMax=Math.max(rightMax,height[hi]);
                res+=rightMax-height[hi];
            }
        }
        return res;
    }
}

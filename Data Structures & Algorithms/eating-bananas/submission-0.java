class Solution {
    public boolean helper(int[] piles,int k, int h){
        //to eat all bananas in group of k under h hours
        int n=piles.length;
        int currHours=0;
        int i=0;
        while(i<n){
            int currHrCount=(piles[i]%k==0)?(piles[i]/k):(piles[i]/k)+1;
            currHours+=currHrCount;
            if(currHours>h) return false;
            i++;
        }
        return true;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        //calc the range
        int lo=1;
        int hi=1;
        for(int pile:piles){
            hi=Math.max(hi,pile);
        }
        while(lo<hi){
            int mid=lo+(hi-lo)/2;
            if(helper(piles,mid,h)){
                hi=mid;
            }else{
                lo=mid+1;
            }
        }
        return lo;
    }
}

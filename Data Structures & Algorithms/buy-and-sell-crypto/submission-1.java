class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int l=0,r=1;
        int maxm=0;
        while(r<n){
            if(prices[l]<prices[r]){
                int profit=prices[r]-prices[l];
                maxm=Math.max(maxm,profit);
            }else{
                l=r;
            }
            r++;
        }
        return maxm;
    }
}

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n=s.length();
        Map<String,Integer> mp=new HashMap<>();
        for(String word:wordDict){
            mp.put(word,1);
        }
        boolean[] dp=new boolean[n+1];
        dp[n]=true;
        for(int i=n-1;i>=0;i--){
            for(String word:wordDict){
                if((i+word.length())<=s.length() && s.substring(i,i+word.length()).equals(word)){
                    dp[i]=dp[i+word.length()];
                }
                if(dp[i]) break;
            }
        }
        return dp[0];
    }
}

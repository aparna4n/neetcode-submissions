class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        if(n==0) return 0;
        int res=0;
        Set<Character> st=new HashSet<>();
        for(char c:s.toCharArray()){
            st.add(c);
        }
        for(char c:st){
            int count=0,left=0;
            for(int right=0;right<n;right++){
                if(s.charAt(right)==c){
                    count++;
                }
                while((right-left+1)-count>k){
                    if(s.charAt(left)==c){
                        count--;
                    }
                    left++;
                }
                res=Math.max(res,right-left+1);
            }
        }
        return res;
    }
}

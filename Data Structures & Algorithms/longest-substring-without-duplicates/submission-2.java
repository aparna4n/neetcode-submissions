class Solution {
    public int lengthOfLongestSubstring(String s) {
     int n=s.length();
     int res=1;
     if(n==0) return 0;
     int left=0;
     Set<Character> st=new HashSet<>();
     for(int right=0;right<n;right++){
        while(st.contains(s.charAt(right))){
            st.remove(s.charAt(left));
            left++;
        }
        st.add(s.charAt(right));
        res=Math.max(res,right-left+1);
     }  
     return res; 
    }
}

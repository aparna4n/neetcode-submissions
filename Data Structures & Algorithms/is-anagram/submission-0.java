class Solution {
    public boolean isAnagram(String s, String t) {
        int n=s.length();
        if(t.length()!=n) return false;
        int[] one=new int[26];
        int[] two=new int[26];
        for(int i=0;i<n;i++){
            one[s.charAt(i)-'a']++;
            two[t.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(one[i]!=two[i]) return false;
        }
        return true;
    }
}

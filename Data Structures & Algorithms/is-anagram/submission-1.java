class Solution {
    public boolean isAnagram(String s, String t) {
        int[] word1=new int[26];
        int[] word2=new int[26];

        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++){
            word1[s.charAt(i)-'a']++;
            word2[t.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(word1[i]!=word2[i]) return false;
        }
        return true;
    }
}

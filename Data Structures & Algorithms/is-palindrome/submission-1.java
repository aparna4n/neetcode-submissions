class Solution {
    public boolean isAlpha(char c){
       return Character.isLetterOrDigit(c);
    }
    public boolean isPalindrome(String s) {
        int lo=0,hi=s.length()-1;
        while(lo<hi){
            if(!isAlpha(s.charAt(lo))) lo++;
            else if(!isAlpha(s.charAt(hi))) hi--;
            else{
                if(Character.toLowerCase(s.charAt(lo))!=Character.toLowerCase(s.charAt(hi))){
                    return false;
                }
                lo++;
                hi--;
            }
        }
        return true;
    }

}

class Solution {
    public boolean isPalindrome(String s) {
        char[] c=s.toCharArray();
        int n=c.length;
        int lo=0,hi=n-1;
        while(lo<hi){
            if(c[lo]==' ' || !isAlpha(c[lo])){
                lo++;
                continue;
            }
            if(c[hi]==' ' || !isAlpha(c[hi])){
                hi--;
                continue;
            }
            if(Character.toLowerCase(c[lo])!=Character.toLowerCase(c[hi])){
                return false;
            }
            lo++;
            hi--;
        }
        return true;
    }
    public boolean isAlpha(char v){
        if((v>='A' && v<='Z') || (v>='a' && v<='z') ||(v>='0' && v<='9'))
        return true;

        return false;
    }
}

class Solution {
    int n;
    char[][] dir={{},{},{'A','B','C'},{'D','E','F'},{'G','H','I'},{'J','K','L'},{'M','N','O'},{'P','Q','R','S'},{'T','U','V'},{'W','X','Y','Z'}};
    public void letterCombinationsHelper(char[] c,int index,char[] finalString,List<String> res){
        //if the index is greater than n
        if(index>=n){
            res.add(new String(finalString));
            return;
        }
        int digit=c[index]-'0';
        for(int i=0;i<dir[digit].length;i++){
            char current=dir[digit][i];
            //add the curr char 
            finalString[index]=Character.toLowerCase(current);
            letterCombinationsHelper(c,index+1,finalString,res);
        }
    }
    public List<String> letterCombinations(String digits) {
        n=digits.length();
        char[] finalString=new char[n];
        char[] c=digits.toCharArray();
        List<String> res=new ArrayList<>();
        if(n==0) return new ArrayList<>();
        letterCombinationsHelper(c,0,finalString,res);
        return res;
    }
}

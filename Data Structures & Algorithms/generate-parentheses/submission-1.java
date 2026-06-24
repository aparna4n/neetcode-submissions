class Solution {
    public void generateParenthesisHelper(int n,int left,int right,char[] c,int index,List<String> res){
        if(index>=2*n){
            res.add(new String(c));
            return;
        }
        //add right
        if(right<n){
            c[index]='(';
            generateParenthesisHelper(n,left,right+1,c,index+1,res);
        }
        if(left<right && left<n){
            c[index]=')';
            generateParenthesisHelper(n,left+1,right,c,index+1,res);
        }
    }
    public List<String> generateParenthesis(int n) {
        char[] c=new char[2*n];
        List<String> res=new ArrayList<>();

        generateParenthesisHelper(n,0,0,c,0,res);
        return res;
    }
}

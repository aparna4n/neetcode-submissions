class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> left=new Stack<>();
        Stack<Integer> star=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                left.add(i);
            }else if(s.charAt(i)=='*'){
                star.add(i);
            }else{
                if(left.isEmpty() && star.isEmpty()) return false;
                if(!left.isEmpty()) left.pop();
                else star.pop();
            }
        }
        while(!left.isEmpty() && !star.isEmpty()){
            if(left.pop()>star.pop()) return false;
        }
        return left.isEmpty();
    }
}

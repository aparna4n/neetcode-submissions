class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        if(n%2!=0) return false;

        Stack<Character> st=new Stack<>();

        int i=0;
        while(i<n){
            if(s.charAt(i)==')'||s.charAt(i)=='}'||s.charAt(i)==']'){
                if(st.size()==0) return false;
                if(s.charAt(i)==')' && st.peek()!='(') return false;
                if(s.charAt(i)=='}' && st.peek()!='{') return false;
                if(s.charAt(i)==']' && st.peek()!='[') return false;
                st.pop();
                i++;
            }else{
                st.push(s.charAt(i));
                i++;
            }
        }
        return st.size()==0;

    }
}

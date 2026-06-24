class Solution {
    public int evalRPN(String[] tokens) {
     int n=tokens.length;
     Stack<Integer> st=new Stack<>();
     for(int i=0;i<n;i++){
        if(tokens[i].equals("+")||tokens[i].equals("-")||tokens[i].equals("*")||tokens[i].equals("/")){
            if(st.size()<2) return -1;
            int sec=st.pop();
            int first=st.pop();
            int fin=-1;
            if(tokens[i].equals("+")){
                fin=sec+first;
            }else if(tokens[i].equals("-")){
                fin=first-sec;
            }else if(tokens[i].equals("*")){
                fin=sec*first;
            }else if(tokens[i].equals("/")){
                fin=first/sec;
            }
            st.push(fin);
        }else{
            int nnn=Integer.parseInt(tokens[i]);
            st.push(nnn);
        }
     }
     return st.peek();
    }
}

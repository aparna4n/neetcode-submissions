class MinStack {
    Stack<Integer> st;
    Stack<Integer> minSt;

    public MinStack() {
        st=new Stack<>();
        minSt=new Stack<>();
    }
    
    public void push(int val) {
      //push the given ele
      st.push(val);
      if(minSt.size()==0){
        minSt.push(val);
      }else{
        if(minSt.peek()>=val){
            minSt.push(val);
        }
      }
    }
    
    public void pop() {
        int val=st.peek();
        st.pop();
        if(minSt.size()!=0 && val==minSt.peek()){
            minSt.pop();
        }
    }
    
    public int top() {
        return st.peek();

    }
    
    public int getMin() {
        if(minSt.size()==0) return -1;
        return minSt.peek();
    }
}

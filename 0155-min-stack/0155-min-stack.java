class MinStack {
    Stack<Integer> st=new Stack<>();
    Stack<Integer> st2=new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int value) {
        st.push(value);
        if(st2.isEmpty()||value<=st2.peek()){
            st2.push(value);
        }
    }
    
    public void pop() {

        int del=st.pop();
        if(del==st2.peek()){
            st2.pop();
        }
    }
    
    public int top() {
        return st.peek();
        
    }
    
    public int getMin() {
       int min=st2.peek();
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
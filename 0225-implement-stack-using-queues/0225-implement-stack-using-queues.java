class MyStack {
    Queue<Integer> q1=new ArrayDeque();
    Queue<Integer> q2=new ArrayDeque();
    public MyStack() {
        
    }
    
    public void push(int x) {
        q2.offer(x);
        while(!q1.isEmpty()){
            q2.offer(q1.peek());
            q1.poll();
        }
        while(!q2.isEmpty()){
            q1.offer(q2.peek());
            q2.poll();
        }
        
    }
    
    public int pop() {
        return q1.poll();
        
    }
    
    public int top() {
        int ans=q1.peek();
        return ans;
    }
    
    public boolean empty() {
       return q1.isEmpty(); 
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
class Solution {
    public int evalRPN(String[] tokens) {
     Stack<Integer> st=new Stack<>();
     st.push(Integer.parseInt(tokens[0]));
     for(int i=1;i<tokens.length;i++){
        if(tokens[i].equals("+")){
            int l1=st.pop();
            int l2=st.pop();
            st.push(l1+l2);
        }
       else if(tokens[i].equals("-")){
            int l1=st.pop();
            int l2=st.pop();
            st.push(l2-l1);
        }
      else if(tokens[i].equals("*")){
            int l1=st.pop();
            int l2=st.pop();
            st.push(l1*l2);
        }
       else if(tokens[i].equals("/")){
            int l1=st.pop();
            int l2=st.pop();
            st.push(l2/l1);
        }
        else{
            st.push(Integer.parseInt(tokens[i]));
        }
     }  
     return st.peek(); 
    }
}
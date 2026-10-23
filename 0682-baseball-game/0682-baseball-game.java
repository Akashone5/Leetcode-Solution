class Solution {
    public int calPoints(String[] operations) {
      Stack<Integer> st=new Stack<>();
      for(int i=0;i<operations.length;i++){
        if(operations[i].equals("C")){
            st.pop();
        }
        else if(operations[i].equals("D")){
            int k=st.peek()*2;
            st.push(k);
        }
        else if(operations[i].equals("+")){
          int t=st.pop();
          int nt=st.peek();
          int ne=t+nt;
          st.push(t);
          st.push(ne);
        }
        else st.push(Integer.parseInt(operations[i]));
      }  
      int sum=0;
     while(!st.empty()){
        sum+=st.pop();
     }
      return sum;
    }
}
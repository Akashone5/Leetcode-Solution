class Solution {
    public String minRemoveToMakeValid(String s) {
      Stack<Character> st=new Stack<>();
      int bre=0;
      for(char ch: s.toCharArray()){
        if(ch=='('){
            bre++;
            st.push(ch);
        }
        else if(ch==')'){
           if(bre>0){
            bre--;
            st.push(ch);
           }
        }
        else st.push(ch);
      }
      StringBuilder sb=new StringBuilder();
      while(!st.isEmpty()){
        char ch1=st.pop();
        if(ch1=='(' && bre>0){
            bre--;
        }
        else sb.append(ch1);
      }
      return sb.reverse().toString();
    }
}
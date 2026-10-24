class Solution {
    public boolean backspaceCompare(String s, String t) {
      Stack<Character> st=new Stack<>();
      Stack<Character> st2=new Stack<>();
      for(int i=0;i<s.length();i++){
        if(s.charAt(i)==('#')){
        if(!st.isEmpty()){
            st.pop();
        }}
        else st.push(s.charAt(i));
      }
      for(int i=0;i<t.length();i++){
        if(t.charAt(i)==('#')){
        if(!st2.isEmpty()){
            st2.pop();
        }}
        else st2.push(t.charAt(i));
      }
      return st.equals(st2);  
    }
}
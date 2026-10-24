class Solution {
    public String makeGood(String s) {
        if(s.length()==0)return "";
      Stack<Character> st=new Stack<>();
      st.push(s.charAt(0));
      for(int i=1;i<s.length();i++){
        char ch=s.charAt(i);
        if(!st.isEmpty()&&Math.abs(st.peek()-ch)==32){
            st.pop();
        }
        else st.push(ch);
      }
      StringBuilder sb=new StringBuilder();
      for(char ch:st){
        sb.append(ch);
      }
      return sb.toString();
    }
}
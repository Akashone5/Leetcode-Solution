class Solution {
    public String clearDigits(String s) {
      Stack<Character> st=new Stack<>();
      for(char ch:s.toCharArray()){
        if(Character.isDigit(ch)){
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
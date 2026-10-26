class Solution {
    public String decodeString(String s) {
      Stack<Character> st=new Stack<>();
      Stack<Integer> num=new Stack<>();
      int k=0;
      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
       if(Character.isDigit(ch)){
        k=k*10+(ch-'0');
       }
       else if(ch=='['){
        num.push(k);
        k=0;
        st.push(ch);
       }
       else if(ch==']') {
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()&&st.peek()!='['){
            sb.insert(0,st.pop());
        }
        st.pop();
        int t=num.pop();
        String str=sb.toString();
        for(int p=0;p<t;p++){
            for(int j=0;j<str.length();j++){
                st.push(str.charAt(j));
            }
        }

       }
       else st.push(ch);
      }  
      StringBuilder sb2=new StringBuilder();
      while(!st.isEmpty()){
        sb2.insert(0,st.pop());
      }
      return sb2.toString();
    }
}
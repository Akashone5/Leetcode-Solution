class Solution {
    public int scoreOfParentheses(String s) {
      int count=0;
      int ss=0;
      for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='('){
            count++;
        }
        if(s.charAt(i)==')'){
          //  ss++;
            count--;
        if(s.charAt(i-1)=='('){
            ss+=Math.pow(2,count);
        }
      }  
      }
      return ss;
    }
}
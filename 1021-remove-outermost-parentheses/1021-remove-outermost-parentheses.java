class Solution {
    public String removeOuterParentheses(String s) {
        //String ss="";
        int p=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){ 
              if(p>0){
              sb.append(s.charAt(i));
            }p++;
            }
            else {
                p--;
                if(p>0)
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
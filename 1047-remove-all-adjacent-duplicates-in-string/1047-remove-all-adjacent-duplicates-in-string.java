class Solution {
    public String removeDuplicates(String s) {
     Stack<Character> str=new Stack<>();
     StringBuilder ss=new StringBuilder();
      for(int i=0;i<s.length();i++){
        char y=s.charAt(i);
      if(!str.empty()&&str.peek()==y){
        str.pop();
      }
      else str.push(y);
      } 
for(int i=0;i<str.size();i++){
    ss.append(str.get(i));
}
return ss.toString();
    }
}
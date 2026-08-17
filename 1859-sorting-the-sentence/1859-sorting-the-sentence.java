class Solution {
    public String sortSentence(String s) {
      String w[]=s.split(" ");
      String ch[]=new String[w.length];
      for(int i=0;i<ch.length;i++){
      String word=w[i];
       int index=word.length()-1;
       int no=word.charAt(index)-'0';
String actualWord = word.substring(0, index );
        ch[no-1]=actualWord;
      } 
        String result = "";
        for (int i=0;i<ch.length;i++) {
            result =result+ch[i];
            if(i!=ch.length-1) {
                result =result+" ";
            }
        }
        return result;
    }
}
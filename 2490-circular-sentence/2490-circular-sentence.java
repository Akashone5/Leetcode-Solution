class Solution {
    public boolean isCircularSentence(String sentence) {
      boolean b=true;
     int n=sentence.length();
     if(sentence.charAt(0)!=sentence.charAt(n-1)) return false;
       for(int i=1;i<sentence.length()-1;i++){
        if(sentence.charAt(i)==' '){
            if(sentence.charAt(i-1)!=sentence.charAt(i+1)){
                b= false;
            }
        }
       } 
       return b;
    }
}
class Solution {
    public int firstMatchingIndex(String s) {
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch==s.charAt(s.length()-i-1)){
            return i;
        }
       } 
       return -1;
    }
}
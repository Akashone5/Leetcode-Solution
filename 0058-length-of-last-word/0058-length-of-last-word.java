class Solution {
    public int lengthOfLastWord(String s) {
    s= s.trim();
       int lastgap=s.lastIndexOf(" ");
       return s.length()-lastgap-1;
    }
}
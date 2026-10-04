class Solution {
    public boolean checkValidString(String s) {
        int left=0;
        int start=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                left++;
                start++;
            }
            if(s.charAt(i)==')'){
                left--;
                start--;
            }
            if(s.charAt(i)=='*'){
                left--;
                start++;
            }
            if(start<0){
                return false;
            }
            if(left<0){
                left=0;
            }
        }
        if(left==0) return true;
        return false;
    }
}   
  
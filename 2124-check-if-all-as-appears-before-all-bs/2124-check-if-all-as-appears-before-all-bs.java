class Solution {
    public boolean checkString(String s) {
        if(s.indexOf('b')==-1||s.lastIndexOf('a')<s.indexOf('b')){
            return true;
        }
        else return false;
    }
}
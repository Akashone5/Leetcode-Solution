class Solution {
    public boolean isValid(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            sb.append(ch);
            int n=sb.length();
            if(n>=3&& sb.charAt(n-3)=='a'&&sb.charAt(n-2)=='b'&&sb.charAt(n-1)=='c'){
                sb.delete(n-3,n);
            }
        }
        return sb.length()==0;
    }
}
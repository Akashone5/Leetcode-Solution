class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        StringBuilder sb=new StringBuilder();
        int max=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            while(set.contains(ch)){
                char f=sb.charAt(0);
                set.remove(f);
                sb.deleteCharAt(0);
            }
            set.add(ch);
            sb.append(ch);
            if(sb.length()>max){
                max=sb.length();
            }
        }
        return max;
    }
}
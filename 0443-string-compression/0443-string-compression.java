class Solution {
    public int compress(char[] chars) {
        StringBuilder s=new StringBuilder();
        int i=0;
        while(i<chars.length){
            int count=0;
            char ch=chars[i];
            while(i<chars.length&&chars[i]==ch)
            {
            count++;
            i++;
            }
            s.append(ch);
            if(count>1){
                s.append(count);
            }
        }
        for( i=0;i<s.length();i++){
            chars[i]=s.charAt(i);
        }
        return i;
    }
}
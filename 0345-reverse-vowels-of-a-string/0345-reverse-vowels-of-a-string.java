class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        int low = 0;
        int high = sb.length()-1 ;
        while (high > low) {
            while(high > low && !vowel(sb.charAt(low))){
                low++;
            }
            while(high > low && !vowel(sb.charAt(high))){
                high--;
            }
            if (high > low && vowel(sb.charAt(low))) {
                if (high > low && vowel((sb.charAt(high)))) {
                    char temp = sb.charAt(low);
                    sb.setCharAt(low, sb.charAt(high));
                    sb.setCharAt(high, temp);
                    high--;
                    low++;
                }
                
            }
            
        }
        return sb.toString();
    }

    public boolean vowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U')
            return true;
        return false;
    }
}
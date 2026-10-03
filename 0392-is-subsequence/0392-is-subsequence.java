class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length())
            return false;
        int j = 0, i = 0;
        while (i < t.length() && j < s.length()) {
            if (s.charAt(j) == (t.charAt(i))) {
                j++;
            }
                i++;
        }
        if (j == s.length())
            return true;
        return false;
    }
}
class Solution {
    public int minAddToMakeValid(String s) {
        int count = 0;
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                count++;
            } else {
                if (count > 0) {
                    count--;
                } else
                    res++;
            }
        }
        return res + count;
    }
}
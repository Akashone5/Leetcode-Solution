class Solution {
    public boolean sumGame(String num) {

        int sum1 = 0;
        int sum2 = 0;
        int q1 = 0;
        int q2 = 0;

        for (int i = 0; i < num.length() / 2; i++) {
            char ch = num.charAt(i);
            if (ch == '?') {
                q1++;

            } else
                sum1 = sum1 + num.charAt(i) - '0';
        }

        for (int i = num.length() / 2; i < num.length(); i++) {
            int ch1 = num.charAt(i);
            if (ch1 == '?') {
                q2++;
            }

            else {
                sum2 = sum2 + num.charAt(i) - '0';
            }
        }

        int diff = sum1 - sum2;
        int qsum = q1 + q2;

        if ((qsum) % 2 == 1)
            return true;

        return (sum1 - sum2) * 2 != (q2 - q1) * 9;

    }
}
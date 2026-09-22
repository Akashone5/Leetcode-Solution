class Solution {
    public int minimumSum(int num) {
        int a = 10;
        int b = 20;
        int sum = 0;
        while (num != 0) {
            int temp = num % 10;
            if (temp < a) {
                b = a;
                a = temp;
            }

            else if (temp < b) {
                b = temp;
            }
            sum += temp;
            num /= 10;

        }
        return a * 10 + b * 10 + (sum - a - b);
    }
}
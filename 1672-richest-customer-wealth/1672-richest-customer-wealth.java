class Solution {
    public int maximumWealth(int[][] accounts) {
        int rich = 0;

        for (int i = 0; i < accounts.length; i++) {
            int temp = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                temp = temp + accounts[i][j];
                if (temp > rich) {
                    rich = temp;
                }
            }

        }
        return rich;
    }
}
class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int k=prices[0]+prices[1];
        if(k<money){
            return money-k;
        }
        else if(k>money){
            return money;
        }
        else 
        return 0;
    }
}
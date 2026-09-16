class Solution {
    public int maxIceCream(int[] costs, int coins) {
       Arrays.sort(costs);
       int sum=0;
       int count=0;
       for(int i=0;i<costs.length;i++){
        if(coins>=costs[i]){
            coins=coins-costs[i];
            count++;
        }
        else break;
       } 
       return count;
    }
}
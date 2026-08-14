class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n=fruits.length;
       // boolean full[]=new boolean[n];
        int box=n;
       for(int i=0;i<fruits.length;i++){
        for(int j=0;j<baskets.length;j++){
            if(baskets[j]>=fruits[i]){
                   baskets[j]=-1;              /// constrainn dekh
                    box--;
                    break;
            }
        }
       } 
       return box;
    }
}
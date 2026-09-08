class Solution {
    public int countCommas(int n) {
        int count=0;
            if(n>999&&n<=99999){
                count=n-999;
            }
            if(n==100000){
                count=99001;
        }
        return count;
    }
}
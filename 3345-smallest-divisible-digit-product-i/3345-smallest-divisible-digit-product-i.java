class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
        int pdt=1;
        int num=n;
        int res=0;
        while(num>0){
            res=num%10;
            pdt*=res;
            num=num/10;
        }
        if(pdt%t==0){
            return n;
        }
        n++;
        }
    }
}
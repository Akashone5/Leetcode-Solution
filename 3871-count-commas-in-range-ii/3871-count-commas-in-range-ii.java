class Solution {
    public long countCommas(long n) {
        long count=0;
    if(n>=1000){
            count+=n-999;
    }
    if(n>=1000000){
        count+=n-999999;
    }
    if(n>=1000000000L){
        count+=n-999999999L;
    }
    if(n>=1000000000000L){
        count+=n-999999999999L;
    }
    if(n>=1000000000000000L){
        count+=n-999999999999999L;
    }
    return count;
    }
}
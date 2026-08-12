class Solution {
    public int hIndex(int[] citations) {
          int n=citations.length;
       int l=0;
       int r=n-1;
      
       while(l<=r){
         int mid=l+(r-l)/2;
        if(citations[mid]>=n-mid){
            r--;
        }
        else 
            l++;
        }
       
       return n-l;
    }
}
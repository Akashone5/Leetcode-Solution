class Solution {
    public int reverseBits(int n) {
      int res=0;
      for(int i=0;i<32;i++){
        res=(res<<1)|(n&1);

    n=n>>>1;  //pura n ko shift karna 1 bit to left;

      }
      return res;
      
    }
}
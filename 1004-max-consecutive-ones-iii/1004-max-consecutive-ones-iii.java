class Solution {
    public int longestOnes(int[] nums, int k) {
       int zero=0,l=0,r=0,max=0;
       while(r<nums.length){
        if(nums[r]==0){
            zero++;}
            if(zero>k){
                if(nums[l]==0){
                    zero--;
                }
            l++;}
        
        if(zero<=k){
            int len=r-l+1;
            max=Math.max(max,len);
        }
        r++;
       }
       return max;
    }
}
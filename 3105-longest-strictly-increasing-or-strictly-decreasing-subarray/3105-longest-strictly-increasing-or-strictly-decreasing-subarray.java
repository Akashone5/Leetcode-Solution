class Solution {
    public int longestMonotonicSubarray(int[] nums) {
      int in=1;
      int dn=1;
      int max=1;
      for(int i=1;i<nums.length;i++){
        if(nums[i]>nums[i-1]){
            in++;
            dn=1;
        }
        else if(nums[i]<nums[i-1]){
            dn++;
            in=1;
        }
        else {
            dn=1;
            in=1;
        }
        max=Math.max(Math.max(dn,in),max);
      }  
      return max;
    }
}
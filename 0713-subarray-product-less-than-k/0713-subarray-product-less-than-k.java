class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1){
            return 0;
        }
        int pro=1;
        int count=0;
        int l=0;
       
        for(int i=0;i<nums.length;i++){
          pro=pro*nums[i];
          while(pro>=k){
            pro=pro/nums[l];
            l++;
          }
          count=count+i-l+1;
        }
        return count;
    }
}
class Solution {
    public int maximumDifference(int[] nums) {
        int res=-1;
        int min=nums[0];
        for(int j=1;j<nums.length;j++){
          if(nums[j]>min){
            res=Math.max(res,nums[j]-min);
          }
          else min=nums[j];
        }
        return res;
    }
}
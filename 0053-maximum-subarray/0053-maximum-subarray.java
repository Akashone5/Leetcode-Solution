class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int maxEnd=nums[0];
       int res=nums[0];
       for(int i=1;i<n;i++){
        maxEnd=Math.max(nums[i],maxEnd+nums[i]);
        res=Math.max(res,maxEnd);
       }
       return res;
    }
}
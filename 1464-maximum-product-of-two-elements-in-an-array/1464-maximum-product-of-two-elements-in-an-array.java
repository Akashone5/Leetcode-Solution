class Solution {
    public int maxProduct(int[] nums) {
      int  sum=1;
      int n=nums.length;
      Arrays.sort(nums);
      for(int i=0;i<n;i++){
        sum=(nums[n-1]-1)*(nums[n-2]-1);
      }
return sum;
    }
}
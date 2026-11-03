class Solution {
    public int minMoves(int[] nums) {
      Arrays.sort(nums);
      int k=0; 
      for(int i=0;i<nums.length;i++){
       k+=nums[nums.length-1]-nums[i];
      }
      return k;
    }
}
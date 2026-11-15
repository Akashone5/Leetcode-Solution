class Solution {
    public int countConsistent(int[] nums) {
     int c=0;
      for(int i=0;i<nums.length;i++){
        int min=Integer.MAX_VALUE;
        int x=nums[i];
        for(int j=i;j<nums.length;j++){
           min=Math.min(min,nums[j]);
           x&=nums[j];
           if(x==min) c++;
        }
      }
      return c;
    }
}
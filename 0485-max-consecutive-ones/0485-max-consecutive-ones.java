class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
         int psum=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                psum++;
                max=Math.max(psum,max);
            }
            else psum=0;
        }
        
        return max;
    }
}
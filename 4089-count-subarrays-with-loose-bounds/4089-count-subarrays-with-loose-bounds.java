class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
      long subb=0;
       long len=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=minK&&nums[i]<=maxK){
            subb++;
            len+=subb;
            }
            else {
                subb=0;
            }
        }
        return len;
    }
}
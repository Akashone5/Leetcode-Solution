class Solution {
    public int minDeletions(int[] nums) {
        int c=0;
        for(int i=1;i<nums.length;i++){
        if((nums[i-1]==nums[i])) c++;
        }
    return c;
    }
}
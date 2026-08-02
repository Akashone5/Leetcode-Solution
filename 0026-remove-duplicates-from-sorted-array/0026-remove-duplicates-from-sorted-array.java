class Solution {
    public int removeDuplicates(int[] nums) {
         int i=0;
        int j=0;
        int count = 0;
        while(i<nums.length){
            if(nums[i]==nums[j]){
                i++;
            }
            else{
                nums[j+1] = nums[i];
                j++;
                count++;
            }
        }
        return count+1;
    }
}
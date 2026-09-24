class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int bit=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                bit|=nums[i];
            }
        }
        return bit;
    }
}
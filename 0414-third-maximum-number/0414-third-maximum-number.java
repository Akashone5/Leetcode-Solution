class Solution {
    public int thirdMax(int[] nums) {
    long max=Long.MIN_VALUE;
        long sec=Long.MIN_VALUE;
        long trd=Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==max||nums[i]==sec||nums[i]==trd){
                continue;
            }
            if(nums[i]>max){
                trd=sec;
                sec=max;
                max=nums[i];
            }

            else if(nums[i]>sec){
                trd=sec;
                sec=nums[i];
            }
           else if(nums[i]>trd){
                trd=nums[i];
            }

        }
        if(trd==Long.MIN_VALUE){
            return (int)max;
        }
        else return (int)trd;
    }
}
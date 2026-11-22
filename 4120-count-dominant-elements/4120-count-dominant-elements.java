class Solution {
    public int countDominantElements(int[] nums) {
        int count=0;
        if(nums.length==1) return 1;
        for(int i=0;i<nums.length;i++){
            if(i==0){
                if(nums[i]>=nums[i+1]) count++;
            }
            else if(i==nums.length-1){
              if(nums[i]>=nums[i-1]) count++;  
             }
            else {
                if(2L*nums[i]>=((long)nums[i-1]+nums[i+1]))count++;
            }
            
        }
        return count;
    }
}
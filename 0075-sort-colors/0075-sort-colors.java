class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high){
            if(nums[mid]==0){
                int tem=nums[low];
                nums[low]=nums[mid];
                nums[mid]=tem;
                mid++;
                low++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
               int tem=nums[mid];
                nums[mid]=nums[high];
                nums[high]=tem; 
                high--;
            }
        }
    
    }
}
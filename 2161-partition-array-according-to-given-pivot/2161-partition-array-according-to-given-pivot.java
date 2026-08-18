class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
      int n=nums.length;
      int l=0;
      int r=n-1;
      int res[]=new int[n];
      for(int i=0;i<n;i++){
        if(nums[i]<pivot){
            res[l]=nums[i];
            l++;
        }
      }
       for(int j=n-1;j>=0;j--){
        if(nums[j]>pivot){
            res[r]=nums[j];
            r--;
        }
      }
      for(int i=0;i<n;i++){
        if(nums[i]==pivot){
        res[l]=nums[i];
        l++;
      }}
    return res;
    }
}
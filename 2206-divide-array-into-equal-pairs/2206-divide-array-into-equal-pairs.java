class Solution {
    public boolean divideArray(int[] nums) {
      Arrays.sort(nums);
      int n=nums.length;
      int arr[]=new int[n/2];
      int arr2[]=new int[n/2];
      int idx=0;
      for(int i=0;i<n;i+=2){
        arr[idx]=nums[i];
        arr2[idx]=nums[i+1];
        idx++;
      } 
      for(int i=0;i<nums.length/2;i++){
        if(arr[i]!=arr2[i]){
            return false;
        }
      }  
      return true;
    }
}
class Solution {
    public int findPeakElement(int[] nums) {
      int arr[]=Arrays.copyOf(nums,nums.length); 
      Arrays.sort(arr);
      int fax=0;
      int target=arr[nums.length-1];
      for(int i=0;i<nums.length;i++){
      if(nums[i]==target) fax=i;
    }
    return fax;
    }
}
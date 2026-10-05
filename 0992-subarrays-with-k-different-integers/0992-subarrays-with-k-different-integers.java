class Solution {
    public static int sub(int[] nums, int k){
     int count=0;
     int low=0;
     int eres=0;
     int arr[]=new int[nums.length+1];
     for(int i=0;i<nums.length;i++){
        if(arr[nums[i]]==0){
            count++;
        }
     arr[nums[i]]++;
        while(count>k){
            arr[nums[low]]--;
            if(arr[nums[low]]==0){
                count--;
            }
            low++;
        }
        eres+=i-low+1;
     }
     return eres;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return sub(nums,k)-sub(nums,k-1);
    }}

class Solution {
     public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;  
        k=n-k-1;   
      
       reverse(nums,0,k);
        reverse(nums,k+1,n-1);
         reverse(nums,0,n-1);
    }
    void reverse(int nums[],int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    
}}
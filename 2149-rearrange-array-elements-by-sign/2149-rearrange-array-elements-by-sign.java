class Solution {
    public int[] rearrangeArray(int[] nums) {
       int n=nums.length;
       int p=0;
       int N=1;
       int arr[]=new int[n]; 
       for(int i=0;i<n;i++){
        if(nums[i]>0){
           arr[p]=nums[i];
            p=p+2;;
        }
        else if(nums[i]<0){
            arr[N]=nums[i];
            N=N+2;
        }
       }
       return arr;
    }
}
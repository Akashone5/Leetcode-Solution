class Solution {
    public int get(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int sum[]=new int[nums1.length];
      for(int i=0;i<nums1.length;i++){
        int k=nums1[i];
        int j=get(nums2,k);
        int next=-1;
        for(int m=j+1;m<nums2.length;m++){
            if(nums2[m]>k){
               next=nums2[m];
               break;
            }
        }
        sum[i]=next;
      } 
      return sum; 
    }
}
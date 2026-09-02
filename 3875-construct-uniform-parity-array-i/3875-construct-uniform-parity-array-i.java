class Solution {
    public boolean uniformArray(int[] nums1) {
        int arr[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]%2==0||nums1[i]%2!=0){
                arr[i]=nums1[i];
            }
        }
        if(arr.length==nums1.length){
            return true;
        }
        else return false;
    }
}
class Solution {
    public boolean search(int[] nums, int target) {
       int i=0;
       int j=nums.length;
       int l=0;
       Arrays.sort(nums);
       while(i<j){
        int mid=i+(j-i)/2;
        if(nums[mid]>target){
            j--;
        }
        if(nums[mid]<target){
            i++;
        }
        if(nums[mid]==target){
            l=1;
            break;
        }
        else l=0;
       }
        if (l == 1)
            return true;
        else
            return false;
    }
}
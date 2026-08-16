class Solution {
    public int maxProduct(int[] nums) {
        int m=Integer.MIN_VALUE,f=m;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=f){
                m=f;
                f=nums[i];
            }
            else if(nums[i]>m){
                m=nums[i];
            }
        }
        return (f-1)*(m-1);
    }
}
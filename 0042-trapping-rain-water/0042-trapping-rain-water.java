class Solution {
    public int trap(int[] height) {
        int left=0;
        int right=height.length-1;
        int water=0;
        int lmax=0;
        int rmax=0;
        //int max=0;
        while(left<right){
            if(height[left]<height[right]){
                lmax=Math.max(lmax,height[left]);
                water=water+lmax-height[left];
               left++;
            }
            else{
                rmax=Math.max(rmax,height[right]);
                water=water+rmax-height[right];
                right--;
            }
        }
        return water;
    }
}
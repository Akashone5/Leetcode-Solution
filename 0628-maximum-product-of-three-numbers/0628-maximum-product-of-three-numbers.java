class Solution {
    public int maximumProduct(int[] nums) {
        int pro=1;
        int pro2=1;
        int n=nums.length;
        Arrays.sort(nums);
        pro=pro*nums[n-1]*nums[n-2]*nums[n-3];
        pro2=pro2*nums[0]*nums[1]*nums[n-1];
        return Math.max(pro,pro2);
    }
}
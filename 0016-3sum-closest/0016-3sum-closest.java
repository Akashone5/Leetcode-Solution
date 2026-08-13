class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int tar = target;
        int Res = nums[0] + nums[1] + nums[2];
     int Maxdiff = Math.abs(tar - Res);
        for (int i = 0; i < n - 2; i++) {
            int l = i + 1;
            int r = n - 1;
            while (l < r) {
                //int Maxdiff = Integer.MAX_VALUE;
                int sum = (nums[i] + nums[l] + nums[r]);
                int as = Math.abs(tar - sum);

                if (sum == tar) {
                    return sum;
                }
                if (as < Maxdiff) {
                    Maxdiff = as;
                    Res = sum;
                }

                else if (sum > tar) {
                    r--; 
                } else
    l++;
                   
            }
        }
        return Res;
    }
}
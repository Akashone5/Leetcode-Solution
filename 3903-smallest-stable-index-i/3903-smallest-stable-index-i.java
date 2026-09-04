class Solution {
    public int firstStableIndex(int[] nums, int k) {
        if (nums.length <= 1)
            return 0;

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            //int stable=0;

            max = Math.max(max, nums[i]);
            int min = Integer.MAX_VALUE;
            
            for (int j = i ; j < nums.length; j++) {
              min=Math.min(nums[j],min);
            }
            int stable = max - min;
            if (stable <= k) {

                return i;
            }
        }
        return -1;
    }
}
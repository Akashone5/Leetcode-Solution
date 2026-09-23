class Solution {
    public int minOperations(int[] nums, int x) {
        int totalS=0;
        for(int i=0;i<nums.length;i++){
            totalS+=nums[i];
        }
        int tar=totalS-x;
        int l=0;
        int sum=0;
        int len=-1;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(l<=i&&sum>tar){
                sum-=nums[l++];
            }
            if(sum==tar){
                len=Math.max(len,i-l+1);
            }
        }
        if(len!=-1){
            return nums.length-len;
        }else return -1;
    }
}
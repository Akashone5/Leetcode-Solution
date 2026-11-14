class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int min=Integer.MAX_VALUE;
         while(l<=r){
        int sum=0;
        for(int i=0;i<l;i++){
            sum+=nums.get(i);
        }
        if(sum>0) min=Math.min(min,sum);
         for(int i=l;i<nums.size();i++){
            sum+=nums.get(i);
            sum-=nums.get(i-l);
            if(sum>0){
                min=Math.min(sum,min);
            }
         }
         l++;
         }
        if(min==Integer.MAX_VALUE) return -1;
        else return min;
    }
}
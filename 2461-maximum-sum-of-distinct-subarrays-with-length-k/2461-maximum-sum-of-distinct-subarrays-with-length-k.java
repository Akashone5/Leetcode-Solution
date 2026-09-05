class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap <Integer,Integer> map=new HashMap<>();
        long max=0;
        long sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
      if(map.size()==k) max=sum;
      else max=0;
        for(int i=k;i<nums.length;i++){
            sum+=nums[i];
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            sum-=nums[i-k];
            map.put(nums[i-k],map.get(nums[i-k])-1);
            if(map.get(nums[i-k])==0){
                map.remove(nums[i-k]);
            }
           if(map.size()==k){
                max=Math.max(sum,max);
            }
        }
        return max;
    }
}
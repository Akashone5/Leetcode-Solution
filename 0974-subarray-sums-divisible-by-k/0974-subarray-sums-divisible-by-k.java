class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int res=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            int rem=sum%k;
            if(rem<0){
                rem=rem+k;
            }
            res+=map.getOrDefault(rem,0);
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return res;
    }
}
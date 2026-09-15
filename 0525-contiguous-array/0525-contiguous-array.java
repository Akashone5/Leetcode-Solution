class Solution {
    public int findMaxLength(int[] nums) {
        int sum=0;
        int res=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            //HashMap<Integer,Integer> map=new HashMap<>();
           if(nums[i]==0){
            sum+=-1;
           }   else sum+=1;
           if(map.containsKey(sum)){
            res=Math.max(res,i-map.get(sum));
           }else map.put(sum,i); 
        }
        return res;
    }
}
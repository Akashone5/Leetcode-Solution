class Solution {
    public int maxFrequencyElements(int[] nums) {
          HashMap<Integer,Integer> map=new HashMap<>();
       for(int i:nums)
       map.put(i,map.getOrDefault(i,0)+1);
       int max= Collections.max(map.values());
       int sum=0;
       for(int f:map.values())
       {
        if(f==max){
            sum+=f;
        }
       }
       return sum;
    }
}
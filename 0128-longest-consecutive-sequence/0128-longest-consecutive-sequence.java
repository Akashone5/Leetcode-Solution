class Solution {
    public int longestConsecutive(int[] nums) {
    int n=nums.length;
    if(n==0) return 0;
    int max=1;
    HashSet<Integer> set=new HashSet<>();
    for( int i:nums) set.add(i);
    for(int i: set){
       if(!set.contains(i-1)){
        int count=1;
        int idx=i;
        while(set.contains(idx+1)){
            idx+=1;
            count+=1;
        }
        max=Math.max(max,count);
       }
    }
    return max; 
    }
}
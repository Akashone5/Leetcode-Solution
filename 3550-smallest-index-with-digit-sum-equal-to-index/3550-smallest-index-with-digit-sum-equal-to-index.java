class Solution {
    public int smallestIndex(int[] nums) {
        int idx=-1;
       for(int i=0;i<nums.length;i++){
        int h=nums[i];
        int sum=0;
        while(h>0){
            int t=h%10;
            sum+=t;
            h/=10;}
            if(sum==i){
                idx=i;
                return idx;
            }
        
       } 
       return idx;
    }
}
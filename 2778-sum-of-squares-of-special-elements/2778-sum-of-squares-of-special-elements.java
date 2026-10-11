class Solution {
    public int sumOfSquares(int[] nums) {
       int n=nums.length;
       int count=0;
       for(int i=0;i<n;i++){
        if(n%(i+1)==0){
            count+=nums[i]*nums[i];
        }
       } 
       return count;
    }
}
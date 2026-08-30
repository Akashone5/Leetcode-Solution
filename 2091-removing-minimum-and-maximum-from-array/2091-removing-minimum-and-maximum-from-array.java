class Solution {
    public int minimumDeletions(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int a=-1;
        int b=-1;
       // ArrayList <Integer> arr=new ArrayList<>();
       for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
                a=i;
            }
            if(nums[i]>max){
                max=nums[i];
                b=i;
            }
       } 
    int k1=Math.min(a,b);
    int k2=Math.max(a,b);
    int n=nums.length;
    int x=k2+1;
    int y=n-k1;
    int z=(k1+1)+(n-k2);
    return Math.min(x,Math.min(y,z));
    }
}
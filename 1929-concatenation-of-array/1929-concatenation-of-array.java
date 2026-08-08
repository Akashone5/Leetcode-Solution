class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int y=n*2;
     int arr[]=new int[y];
     for(int i=0;i<n;i++) {
      arr[i]=nums[i];
     }  
     for(int i=n;i<y;i++){
        arr[i]=nums[i-n];
     }
     return arr;
    }
}
class Solution {
    public int maxProduct(int[] nums) {
        int arr[]=nums;
       int n=arr.length;
        if(n==0) return 0;
        int max=arr[0];
        int maxp=arr[0];
        int minp=arr[0];
        for(int i=1;i<n;i++){
            int maxx=Math.max(arr[i]*maxp,Math.max(arr[i]*minp,arr[i]));
            int minn=Math.min(arr[i]*maxp,Math.min(arr[i]*minp,arr[i]));
                
            maxp=maxx;
            minp=minn;
            max=Math.max(max,maxx);
        }
        return max;  
    }
}
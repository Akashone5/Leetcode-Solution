class Solution {
    boolean possible(int[] arr,int days,int m,int k){
        int count=0;
        int bdays=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]<=days){
                count++;
                if(count==k){
                bdays++;
                count=0;
                }
            }
            else{
                count=0;
            }
            if(bdays>=m)return true;
        }
         return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if((m*k)>bloomDay.length) return -1;
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        for(int i=0;i<bloomDay.length;i++){
            low=Math.min(bloomDay[i],low);
            high=Math.max(bloomDay[i],high);
        }
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(possible(bloomDay,mid,m,k)){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
}
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0;
        int low=0;
        int high=k;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int avg=sum/k;
        int count=0;
        if(avg>=threshold){
           count=1;
        }
        int le=0;
      for(int i=k;i<arr.length;i++){
            sum=sum-arr[le++];
            sum=sum+arr[i];
          
            if((sum/k)>=threshold) count++;
        }
         return count;
      }
     
    }

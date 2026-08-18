class Solution {
     public static void reverse(int arr[], int i,int j){
         while(i<j){
          
               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
               i++;
               j--;
           
    }}
    void nextPermutation(int[] arr) {
        int n=arr.length;
        int idx=-1;
        for(int k=n-2;k>=0;k--){
                   if(arr[k]<arr[k+1]){
                       idx=k;
                       break;
                   }
         }
         if(idx==-1){
             reverse(arr,0,n-1);
             return;
         }
         
           
       for(int i=n-1;i>idx;i--){
           if(arr[i]>arr[idx]){
               int temp=arr[i];
               arr[i]=arr[idx];
               arr[idx]=temp;
               break;
           }
       }
        reverse(arr,idx+1,n-1);   
    }
}
class Solution {
    public int[] replaceElements(int[] arr) {
      int n=arr.length;
      int lst=-1;
      for(int i=n-1;i>=0;i--){
        int temp=arr[i];
        arr[i]=lst;
       lst=Math.max(temp,lst);
      }  
     // arr[n-1]=-1;
      return arr;
    }
}
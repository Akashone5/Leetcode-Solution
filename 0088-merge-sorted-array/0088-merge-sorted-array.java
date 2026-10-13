class Solution {
    public static void rec(int n[],int i,int a[],int j,int k){
        if(j<0) return ;
        if(i>=0 &&n[i]>a[j]){
            n[k]=n[i];
            rec(n,i-1,a,j,k-1);
        }
        else{
        n[k]=a[j];
        rec(n,i,a,j-1,k-1);
        }
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      rec(nums1,m-1,nums2,n-1,m+n-1);
    }
}
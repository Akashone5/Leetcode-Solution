class Solution {
    public int[] decrypt(int[] code, int k) {
        int arr[]=new int[code.length];
        int left=0;
        int right=0;
        if(k==0){
            return arr;
        }
        if(k>0){
            left=1;
            right=k;
        }
        if(k<0){
            left=code.length+k;
            right=code.length-1;
        }
        int sum=0;
        for(int i=left;i<=right;i++){
            sum+=code[i];
        }
        for(int i=0;i<code.length;i++){
            arr[i]=sum;
            sum-=code[left];
            left=(left+1)%code.length;
            right=(right+1)%code.length;
            sum+=code[right];
        }
        return arr;
    }
}
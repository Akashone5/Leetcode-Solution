class Solution {
int find(int a[]){
   int maxf=-1;
   for(int i=0;i<256;i++) //func
   maxf=Math.max(maxf,a[i]);
   return maxf;
}
   int characterReplacement(String s, int k) {
       int n=s.length();
       int f[]=new int[256];
       int low=0,high=0,res=Integer.MIN_VALUE;
       for(high=0;high<n;high++)
       {
           f[s.charAt(high)]++;
           int maxcout=find(f);
           int len=high-low+1;
           int diff=len-maxcout;
           while(diff>k)     ////slideeeeeee
           {
               f[s.charAt(low)]--;
               low++;
               maxcout=find(f);
               len=high-low+1;
               diff=len-maxcout;
           }
           len=high-low+1;
           res=Math.max(res,len);
       }
       return res;
   }
}
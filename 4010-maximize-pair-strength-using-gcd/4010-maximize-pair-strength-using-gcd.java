class Solution {
     public static int gcd(int a,int b){
            while(b!=0){
                int temp=b;
                b=a%b;
                a=temp;
            }
            return a;
    
    }

    public long maxPairStrength(int[] nums) {

    long strength=0;
    for(int i=0;i<nums.length-1;i++){
        for(int j=i+1;j<nums.length;j++){
       int a=nums[i];
       int b=nums[j];
       long c = 1L*a*b;
       long d = gcd(a,b);
       long h = c/(d*d);
       strength=Math.max(h,strength);
    }}
  return strength;
    }}
    


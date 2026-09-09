class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n=nums.length;
       ArrayList <Integer> al=new ArrayList<>();
       long sum=0;
         int p=(2*k)+1;
        if(p>n) {
            int[] array=new int[n];
            Arrays.fill(array,-1);
            return array;
        }
       for(int i=0;i<p;i++){
        sum+=nums[i];
        if(i<k){
            al.add(-1);
        }}
       al.add((int)(sum/p));
       for(int i=p;i<n;i++){
        sum-=nums[i-p];
        sum+=nums[i];
        al.add((int)(sum/p));
       }
       for(int i=0;i<k ;i++) {
       al.add(-1);
       }
       int array[]=new int[n];
       for(int i=0;i<n;i++){
        array[i]=al.get(i);
       }
       return array;
    }
}
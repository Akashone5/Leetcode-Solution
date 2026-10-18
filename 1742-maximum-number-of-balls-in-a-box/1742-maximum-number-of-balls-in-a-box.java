class Solution {
    public static int sum(int n){
        if(n==0) return 0;
        return n%10+(sum(n/10));
    }
    public int countBalls(int lowLimit, int highLimit) {
      HashMap<Integer,Integer> map=new HashMap<>();
      int arr[]=new int[highLimit-lowLimit+1];
      int k=0;
      for(int i=lowLimit;i<=highLimit;i++){
        arr[k++]=i;
      }  
      int max=-1;
      for(int i:arr){
        int box=sum(i);
        map.put(box,map.getOrDefault(box,0)+1);
        max=Math.max(max,map.get(box));
      }
      return max;
    }
}
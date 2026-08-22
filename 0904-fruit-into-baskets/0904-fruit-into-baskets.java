class Solution {
    public int totalFruit(int[] fruits) {
      int n=fruits.length;
      int low=0;
      int res=0;
      HashMap <Integer,Integer> map=new HashMap<>();
      for(int i=0;i<n;i++){
        map.put(fruits[i],map.getOrDefault(fruits[i],0)+1);
        if(map.size()>2){
            int lfru=fruits[low];
            map.put(lfru,map.get(lfru)-1);
           if(map.get(lfru)==0){
                map.remove(lfru);
           }
                low++;
            
        }
            res=Math.max(res,i-low+1);
      }  
        return res;
    }
}
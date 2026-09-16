class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        ArrayList<Integer> all=new ArrayList<>();
      TreeMap<Integer,Integer> map=new TreeMap<>();
       for(int i:bulbs){
        map.put(i,map.getOrDefault(i,0)+1);
       }
       for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()%2!=0){
                all.add(entry.getKey());
            }
       }
       return all;
    }
}
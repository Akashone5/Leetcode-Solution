class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       ArrayList<Integer> al=new ArrayList<>();
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i:nums){
        map.put(i,map.getOrDefault(i,0)+1);
       } 
       for(Map.Entry<Integer,Integer> entry:map.entrySet()){
        if(entry.getValue()==2){
            al.add(entry.getKey());
        }
       }
       return al;
    }
}
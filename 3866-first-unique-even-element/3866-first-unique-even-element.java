class Solution {
    public int firstUniqueEven(int[] nums) {
        HashMap<Integer,Integer> map=new LinkedHashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()==1&&entry.getKey()%2==0) return entry.getKey();
        }
        return -1;
    }
}
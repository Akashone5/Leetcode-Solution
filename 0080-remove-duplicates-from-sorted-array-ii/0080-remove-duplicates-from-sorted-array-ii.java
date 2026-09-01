class Solution {
    public int removeDuplicates(int[] nums) {
        TreeMap <Integer,Integer> map=new TreeMap<>();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int num:nums)
        map.put(num,map.getOrDefault(num,0)+1);
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(entry.getValue()>=2){
                arr.add(entry.getKey());
                arr.add(entry.getKey());
            }
            else arr.add(entry.getKey());
        }
        for(int i=0;i<arr.size();i++){
            nums[i]=arr.get(i);
        }
        return arr.size();
    }
}
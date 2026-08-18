class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int arr[]=nums;
            int t=(arr.length)/3;
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> result=new ArrayList<>();
        for(int num:arr)
        map.put(num,map.getOrDefault(num,0)+1);
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>t){
                result.add(entry.getKey());
            }
        }
        Collections.sort(result);
        return result;
         
    }
}
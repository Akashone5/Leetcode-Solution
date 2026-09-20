class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i: nums)
        map.put(i,map.getOrDefault(i,0)+1);
        ArrayList<Integer> arr=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()==1){
                arr.add( entry.getKey());
            }
        }
        int arr1[]=new int[2];
        for(int i=0;i<2;i++)
        arr1[i]=arr.get(i);
        
        return arr1;
    }
}
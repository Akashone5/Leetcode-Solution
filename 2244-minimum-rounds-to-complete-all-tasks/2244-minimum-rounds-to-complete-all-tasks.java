class Solution {
    public int minimumRounds(int[] tasks) {
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<tasks.length;i++){
        int t=tasks[i];
        map.put(t,map.getOrDefault(t,0)+1);
       }
       int count=0;
       for(Map.Entry<Integer,Integer> entry:map.entrySet()){
        if(entry.getValue()<2){
            return -1;
        }
        else if((entry.getValue())%3==0){
            // count++;
            count+=entry.getValue()/3;
        }
        else{
            count+=(entry.getValue()/3)+1;
        }
        }
       
       return count;
    }
}
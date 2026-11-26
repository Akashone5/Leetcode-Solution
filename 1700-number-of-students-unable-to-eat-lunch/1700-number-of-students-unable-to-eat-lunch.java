class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
      Queue<Integer> Q=new LinkedList<>();
      for(int i:students){
        Q.add(i);
      } 
      for(int p:sandwiches){ 
        boolean b=false;
      for(int i=0;i<Q.size();i++){
        int x=Q.poll();
        if(x==p){
            b=true;
            break;
        }
        else {
            Q.add(x);
        }
      }
      if(!b){
        break;
      }
      }
      return Q.size();
    }
}
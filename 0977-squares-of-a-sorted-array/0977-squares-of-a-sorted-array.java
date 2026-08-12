class Solution {
    public int[] sortedSquares(int[] nums) {
      int n=nums.length;
      List<Integer> a=new ArrayList<>();
       List<Integer> b=new ArrayList<>();
      for(int i: nums ){
        if(i>=0){
            a.add(i);
        }
        else b.add(i);
      }  
     
      if(b.size()==0){
         for(int i=0;i<a.size();i++)
        a.set(i,a.get(i)*a.get(i));
        return a.stream().mapToInt(Integer::intValue).toArray();
      }

      if(a.size()==0){
      for(int i=0;i<b.size();i++)
       b.set(i,b.get(i)*b.get(i));
       Collections.reverse(b);
       return b.stream().mapToInt(Integer::intValue).toArray();
      }

      int i=0;
      int j=0;
      int id=0;
      int p1=a.size();
      int n1=b.size();
      int res[]=new int[p1+n1];
      for(i=0;i<p1;i++){
        a.set(i,a.get(i)*a.get(i));

      }
      for( i=0;i<n1;i++){
        b.set(i,b.get(i)*b.get(i));}
        Collections.reverse(b);
      
     i=0;
      j=0;
      while(i<n1&&j<p1){
        if(b.get(i)<=a.get(j)){
            res[id]=b.get(i);
            i++;
            id++;

        }
        else{ res[id]=a.get(j);
        j++;
        id++;

        }
      }
      while(i<n1){
         res[id++]=b.get(i++);
            
      }
      while(j<p1){
         res[id++]=a.get(j++);
           
      }
        return res;
      
    }
}
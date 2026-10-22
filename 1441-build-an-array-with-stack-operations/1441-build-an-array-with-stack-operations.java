class Solution {
    public List<String> buildArray(int[] target, int n) {
      ArrayList<String> all=new ArrayList<>();
      int i=0;
      int j=1;
      while(i< target.length){
        all.add("Push");
        if(target[i]==j){
        i++;
      }
      else all.add("Pop");
      j++;
      }  
      return all;
    }
}
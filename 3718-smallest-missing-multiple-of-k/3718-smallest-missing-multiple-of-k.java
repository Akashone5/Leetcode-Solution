class Solution {
    public int missingMultiple(int[] nums, int k) {
      HashSet <Integer> map=new HashSet<>();
      for(int num:nums)
      map.add(num);
      int kk=k;
      while(map.contains(kk)){
        kk=kk+k;
      }
      return kk;
     
    }
}
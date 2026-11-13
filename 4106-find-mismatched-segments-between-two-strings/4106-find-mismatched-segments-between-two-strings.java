class Solution {
    public List<List<String>> findMismatchedSegments(String s1, String s2) {
      List<List<String>> al=new ArrayList<>();
      int n=0;
      while(n<s1.length()){
        if(s1.charAt(n)==s2.charAt(n)){
            n++;
        }
        else{
            int i=n;
            while(n<s1.length()&&s1.charAt(n)!=s2.charAt(n)){
                n++;
            }
             al.add(Arrays.asList(s1.substring(i,n),s2.substring(i,n)));
            
        }
      } 
      return al; 
    }
}
class Solution {
    public boolean checkInclusion(String s1, String s2) {
     int n=s1.length();
     int m=s2.length();
     if(n>m) return false;
     int arr1[]=new int[26];
     int arr2[]=new int[26];
     for(int i=0;i<n;i++){
        arr1[s1.charAt(i)-'a']++;
        arr2[s2.charAt(i)-'a']++;
     }
        if(Arrays.equals(arr1,arr2)){
            return true;
        }
        int left=0;
        for(int i=n;i<m;i++){
            arr2[s2.charAt(left++)-'a']--;
            arr2[s2.charAt(i)-'a']++;
            if(Arrays.equals(arr1,arr2)){
                return true;
            }}
          return false;
        
         
    }
}
/* 
int n=s1.length();
      String s="";
      for(int i=0;i<n;i++){
           s= s+s1.charAt(i);
      }
      String s3="";
      for(int i=s.length()-1;i>=0;i--){
        s3=s3+s.charAt(i);
      }
      if(s2.contains(s)||s2.contains(s3)&&){
        return true;
      }
      else return false;
      */
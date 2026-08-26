class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n=s.length();
        int count=0;
      ArrayList<String> arr=new ArrayList<>();
       int min=Integer.MAX_VALUE;
       String ans="";
     for(int i=0;i<n;i++){
        StringBuilder sb=new StringBuilder();
        for(int j=i;j<n;j++){
            if(s.charAt(j)=='1')   count++;
          
            if(count<=k){
                sb.append(s.charAt(j));
            }
            if(count==k){
                arr.add(sb.toString());
                int size=sb.length();
                min=Math.min(min,size);
            }
        }
        count=0;
     }
     Collections.sort(arr);
     for(int i=0;i<arr.size();i++){
        if(arr.get(i).length()==min){
            ans=ans+arr.get(i);
            break;
        }
     }

       return ans; 
    }
}
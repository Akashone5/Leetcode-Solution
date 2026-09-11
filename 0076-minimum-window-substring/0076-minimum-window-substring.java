class Solution {
    public String minWindow(String s, String t) {
        String e="";
        int n=s.length();
        int m=t.length();
        if(s==null||t==null||m>n) return e;
       HashMap<Character,Integer> map1=new HashMap<>();
       HashMap<Character,Integer> map2=new HashMap<>();
       for(int i=0;i<m;i++){
        char ch=t.charAt(i);
        map2.put(ch,map2.getOrDefault(ch,0)+1);
       }   

       int req=map2.size();
       int left=0;
       int got=0;
       int idx=-1;
       int min=Integer.MAX_VALUE;
       for(int i=0;i<n;i++){
        char ch=s.charAt(i);
        map1.put(ch,map1.getOrDefault(ch,0)+1);
       if( map2.containsKey(ch)&&map1.get(ch).equals(map2.get(ch)))
            got++;
        while(got==req){
            int len=i-left+1;
           if(len<min){
            min=len;
            idx=left;
           }
        char lch=s.charAt(left);
       if( map2.containsKey(lch)&&map1.get(lch).equals(map2.get(lch)))
            got--;
        map1.put(lch,map1.get(lch)-1);
            left++;
        
       }
       }
       if(idx==-1){
        return e;
       }
       else return s.substring(idx,idx+min);
    }
}
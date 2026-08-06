class Solution {
public static int gcd(int a,int b){
                while(b!=0){
                int temp=b;
                b=a%b;
                a=temp;
            }
           return a;
        }
    public boolean hasGroupsSizeX(int[] deck) {
        if(deck.length<=1){
            return false;
        }
     HashMap<Integer,Integer> map=new HashMap<>();
     for(int i:deck)
         map.put(i,map.getOrDefault(i,0)+1);
     int res=0;
     for(int i:map.values())
        res=gcd(res,i);
       return res>1;
    }
}
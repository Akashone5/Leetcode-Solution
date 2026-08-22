class Solution {
    public boolean checkDivisibility(int n) {
        int y=n;
        int sum=0;
        int pro=1;
       
        while(n>0){
            int temp=n%10;
            sum=sum+temp;
            pro=pro*temp;
            n=n/10;
        }
       
        if(y%(sum+pro)==0){
            return true;
        }
        else return false;
    }
}
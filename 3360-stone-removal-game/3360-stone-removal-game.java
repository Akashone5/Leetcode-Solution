class Solution {
    public boolean canAliceWin(int n) {
        boolean alice=false;
        int x=10;
        while(n>=x){
            n=n-x;
            x=x-1;
            if(alice==false){
                alice=true;
            }
            else alice =false;
        }
        return alice;



















    //    while(n!=0&&n>=10){
    //     alice=true;
    //     int x=n-10;
    //     if(x>=n-1){
    //         alice=false;
    //         n=n-1;
    //     }
    //     else return alice;
    //    } 
    //    return alice;
    }
}
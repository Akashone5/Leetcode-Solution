class Solution {
    public String[] assignUmbrella(int[] rain) {
        String arr[]=new String[rain.length];
        int x=0;
        int a=0;
        int b=0;
        int n=rain.length;
      for(int i=0;i<rain.length;i++){
          if(i<n-1&&(rain[i+1]==1)&&(rain[i]==1)){
              if(a<=b){
              arr[x++]="Alice";
                  a++;
              }
              else {
                  arr[x++]="Bob";
                  b++;
              }
          }
          else if(rain[i]==1){
              arr[x++]="Bob";
              b++;
          }
          else {
              arr[x++]="None";
          }
          
      }  
        return arr;
    }
}
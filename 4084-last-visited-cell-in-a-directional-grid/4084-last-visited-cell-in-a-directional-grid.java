class Solution {
    public int[] lastVisitedCell(char[][] grid) {
       int i=0;
       int j=0;
       int n=grid[0].length;
       int m=grid.length;
        int arr[]=new int[]{i,j};
        while(i>=0&&i<m&&j>=0&&j<n&&grid[i][j]!=0){
            arr[0]=i;
            arr[1]=j;
            char c=grid[i][j];
            grid[i][j]=0;
                if(c=='L') {
                  j--;
                } 
                else if(c=='R') {
                   j++;
                }
                else if(c=='U'){
                    i--;
                }
                else if(c=='D'){
                   i++;
                }
                else break;
               
        }
        return arr;
    }
}
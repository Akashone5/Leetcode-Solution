class Solution {
    public int countNegatives(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
       int r=m-1;
       int c=0;
        int count=0;
        while(r>=0&&c<n){
            if(grid[r][c]<0){
                count+=(n-c);
                r--;
            }
            else c++;
            
        }
        return count;
    }
}
class Solution {
    public void setZeroes(int[][] matrix) {
        boolean v[]=new boolean[matrix.length];
        boolean h[]=new boolean[matrix[0].length];
       for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            if(matrix[i][j]==0){
               v[i]=true;
               h[j]=true;
            }
        }}
        for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            if(v[i]||h[j]){
                matrix[i][j]=0;
            }
        }
       }
    }
}
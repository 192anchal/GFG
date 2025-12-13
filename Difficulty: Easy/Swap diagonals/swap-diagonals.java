class Solution {
    public void swapDiagonal(int[][] mat) {
        // code here
        int n = mat.length;
      int temp =0;
        for(int i=0;i<n;i++){
            temp = mat[i][i] ;
            mat[i][i]=mat[i][n-1-i];
            mat[i][n-1-i]=temp;
        }
    }
}
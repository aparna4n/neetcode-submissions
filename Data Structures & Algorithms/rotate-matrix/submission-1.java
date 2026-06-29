class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        // first vertically |
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-j-1];
                matrix[i][n-j-1]=temp;
            }
        }
        // diagonal flip / 
        for(int i=0;i<n;i++){
            for(int j=0;j<(n-i);j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[n-j-1][n-i-1];
                matrix[n-j-1][n-i-1]=temp;
            }
        }
        return;
    }
}

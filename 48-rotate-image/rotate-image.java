class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix.length;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int k=0;k<matrix.length;k++){
            int left=0;
            int right = matrix.length-1;
            while(left<right){
                int temp1=matrix[k][left];
                matrix[k][left]=matrix[k][right];
                matrix[k][right]=temp1;
                left++;
                right--;
            }
        }
        
    }
}
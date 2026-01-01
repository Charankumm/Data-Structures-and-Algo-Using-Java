class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int rightWall = n-1;
        int downWall = n-1;
        int topWall = 0;
        int leftWall =0;
        int num = 1;
        int right=0,left = 1,top = 2, down = 3;
        int dir=right;
        while(num<=n*n){
            if(dir==right){
                for(int i=leftWall;i<=rightWall;i++){
                    arr[topWall][i]=num++;
                }
                topWall++;
                dir=down;
            }
            else if(dir==down){
                for(int i=topWall;i<=downWall;i++){
                    arr[i][rightWall]=num++;
                }
                rightWall--;
                dir=left;
            }
            else if(dir==left){
                for(int i=rightWall;i>=leftWall;i--){
                    arr[downWall][i]=num++;
                }
                downWall--;
                dir = top;
            }
            else if(dir==top){
                for(int i=downWall;i>=topWall;i--){
                    arr[i][leftWall]=num++;

                }
                leftWall++;
                dir=right;
            }
        } 
        return arr;
        
       
        


       
        
        
    }
}
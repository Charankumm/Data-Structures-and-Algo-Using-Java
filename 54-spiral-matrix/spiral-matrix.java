class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result=new ArrayList<>();
        int s = matrix.length;
        int e = matrix[0].length;
        int up=0;
        int right=1;
        int down=2;
        int left=3;

        int rightWall=e;
        int leftWall = -1;
        int upWall = 0;
        int downWall = s;

        int direction = right;

        int i=0;
        int j=0;
        while(result.size()!=s*e){
            if(direction==right){
                while(j<rightWall){
                    result.add(matrix[i][j]);
                    j++;
                }
                j--;
                i++;
                rightWall--;
                direction = down;
            }
            else if(direction == down){
                while(i<downWall){
                    result.add(matrix[i][j]);
                    i++;
                }
                i--;
                j--;
                downWall--;
                direction = left;
            }
            else if(direction==left){
                while(j>leftWall){
                    result.add(matrix[i][j]);
                    j--;

                }
                j++;
                i--;
                leftWall++;
                direction = up;
            }
            else if(direction==up){
                while(i>upWall){
                    result.add(matrix[i][j]);
                    i--;
                }
                i++;
                upWall++;
                j++;
                direction=right;
            }
        }
        return result;  
    }
}
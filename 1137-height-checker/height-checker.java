class Solution {
    public int heightChecker(int[] heights) {
        int count =0;
        int[] arr1=new int[heights.length];
        for(int z=0;z<heights.length;z++){
            arr1[z]=heights[z];

        }
        for(int i=0;i<heights.length;i++){
            for(int j=1;j<heights.length-i;j++){
                if(heights[j]<heights[j-1]){
                    int temp=heights[j];
                    heights[j]=heights[j-1];
                    heights[j-1]=temp;
                }

            }
        }
        for(int k=0;k<heights.length;k++){
            if(heights[k]!=arr1[k]){
                count++;
            }
        }
        return count;
        
    }
}
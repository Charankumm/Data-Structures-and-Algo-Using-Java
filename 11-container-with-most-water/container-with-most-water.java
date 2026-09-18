class Solution {
    public int maxArea(int[] height) {
        int minA=Integer.MIN_VALUE;
        int i=0;
        int j=height.length-1;
        while(i<j){
            int area =0;
            if(height[i]<height[j]){
                area = height[i]*(j-i);
                i++;
                if(area>minA){
                    minA=area;
                }
            }
            else if(height[i]>=height[j]){
                area = height[j]*(j-i);
                j--;
                if(area>minA){
                    minA=area;
                }
            }
        }
        return minA;
        
    }
}
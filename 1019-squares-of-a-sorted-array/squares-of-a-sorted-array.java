class Solution {
    public int[] sortedSquares(int[] nums) { // Charan
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        for(int k=0;k<nums.length;k++){
            for(int j=1;j<nums.length-k;j++){
                if(nums[j]<nums[j-1]){
                    int temp=nums[j];
                nums[j]=nums[j-1];
                nums[j-1]=temp;

                }
                
            }
        }
        return nums;
        
    }
}
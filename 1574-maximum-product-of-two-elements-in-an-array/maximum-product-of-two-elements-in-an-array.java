class Solution {
    public int maxProduct(int[] nums) {
        int max=0;
        int slarge=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                slarge=max;
                max=nums[i];
            }
            else if(nums[i]>slarge){
                slarge=nums[i];
            }
        }
        return (max-1)*(slarge-1);
        
    }
}
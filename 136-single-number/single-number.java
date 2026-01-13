class Solution {
    public int singleNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int start = nums[i];
            int count =0;
            for(int j=0;j<nums.length;j++){
                if(start == nums[j] && i!=j){
                    count++;
                }
            }
            if(count == 0){
                return start;
            }
        }
        return -1;
        
    }
}
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] ar = new int[nums.length];
        int s=0;
        int o=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                ar[s]=nums[i];
                s=s+2;
            }
            else{
                ar[o]=nums[i];
                o=o+2;
            }
        }
        return ar;
        
    }
}
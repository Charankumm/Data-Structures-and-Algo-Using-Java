class Solution {
    public int maximumProduct(int[] nums) {
        // Sort array (bubble sort works but Arrays.sort is faster)
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }

        int n = nums.length;
        
        // Case 1: product of 3 largest numbers
        int option1 = nums[n - 1] * nums[n - 2] * nums[n - 3];

        // Case 2: product of 2 smallest numbers (negatives) and the largest number
        int option2 = nums[0] * nums[1] * nums[n - 1];

        return Math.max(option1, option2);
    }
}

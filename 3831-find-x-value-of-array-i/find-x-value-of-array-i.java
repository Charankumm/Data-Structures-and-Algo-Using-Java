class Solution {
    public long[] resultArray(int[] nums, int k) {
        long[] answer = new long[k];
        long[] current = new long[k];
        for (int num : nums) {

            long[] next = new long[k];
            int rem = num % k;
            next[rem]++;
            for (int r = 0; r < k; r++) {
                if (current[r] > 0) {
                    int newRem = (int)((r * (long)num) % k);
                    next[newRem] += current[r];
                    }
                }
                for (int r = 0; r < k; r++) {
                    answer[r] += next[r];
                    }
        current = next;
        }
    return answer;


        
    }
}
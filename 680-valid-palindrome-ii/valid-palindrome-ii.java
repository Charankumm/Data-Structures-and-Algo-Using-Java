class Solution {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return isPalindrome(s, left, right -1) || isPalindrome(s, left+1, right);
            }
            left++;
            right--;
        }
        return true;
    }
        private boolean isPalindrome(String str, int n, int m){
            while(n<m){
                if(str.charAt(n)!=str.charAt(m)){
                    return false;
                }
                n++;
                m--;
            }
            return true;
        }
}
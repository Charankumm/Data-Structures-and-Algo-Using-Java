class Solution {
    public boolean isPalindrome(String s) {
        String result = s.toLowerCase().replaceAll("[^a-z0-9]","");
        StringBuilder str = new StringBuilder(result);
        if(result.equals(str.reverse().toString())){
            return true;
        }
        return false;
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = Integer.MIN_VALUE;
        if(s.length()==0){
            return 0;
        }
        for(int i=0;i<s.length();i++){
            int[] hash = new int[255];
            for(int j=i;j<s.length();j++){
                int index=s.charAt(j);
                if(hash[index]==1){
                    break;
                }
                else{
                    int len=j-i+1;
                    max=Math.max(len,max);
                }
                hash[index]=1;
            }
        }
        return max;
        
    }
}
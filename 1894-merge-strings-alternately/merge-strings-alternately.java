class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StringBuilder(word1.length() + word2.length());
        int i=0;
        while(i<word1.length() && i<word2.length()){
            str.append(word1.charAt(i));
            str.append(word2.charAt(i));
            i++;
        }
        if(i>=word1.length() && i<word2.length()){
            for(int j=i;j<word2.length();j++){
                str.append(word2.charAt(j));
            }
        }
        if(i<word1.length() && i>=word2.length()){
            for(int k = i;k<word1.length();k++){
            str.append(word1.charAt(k));
            }
        }
        return str.toString();
        
    }
}
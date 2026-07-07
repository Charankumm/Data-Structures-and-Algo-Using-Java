class Solution {
    public String reversePrefix(String word, char ch) {
        int n = word.indexOf(ch);
        StringBuilder result = new StringBuilder(word.length());
        StringBuilder str1 = new StringBuilder(word.length()-n);
        StringBuilder str = new StringBuilder();
        for(int i=0;i<word.length();i++){
            if(i<=n){
                str.append(word.charAt(i));
            }
            if(i>n){
                str1.append(word.charAt(i));

            }
        }
        result.append(str.reverse()).append(str1);
        return result.toString();


    }
}
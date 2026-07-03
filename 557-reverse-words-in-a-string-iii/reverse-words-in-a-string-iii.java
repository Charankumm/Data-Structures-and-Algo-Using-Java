class Solution {
    public String reverseWords(String s) {
        String[] str =s.split(" ");
        StringBuilder srt2 = new StringBuilder();
        for(int i=0;i<str.length;i++){
            StringBuilder str3 = new StringBuilder(str[i]);
            srt2.append(str3.reverse() + " ");
        }
        
        
        srt2.deleteCharAt(srt2.length() - 1);   
        return srt2.toString();
        
    }
}
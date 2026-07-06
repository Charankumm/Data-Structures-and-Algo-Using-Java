class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0 || strs==null){
            return "";
        }
        String f1=strs[0];
        for(int i=1;i<strs.length;i++){
            while(!strs[i].startsWith(f1)){
                f1=f1.substring(0,f1.length()-1);
                if(f1.isEmpty()){
                    return "";

                }
            }
        }
        return f1;
        
    }
}
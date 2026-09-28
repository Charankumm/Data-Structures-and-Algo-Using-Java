class Solution {
    public int maxDepth(String s) {
        int nest=0;
        int count =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count++;
                if(count>nest){
                    nest=count;
                }
                
            }
            else if(s.charAt(i)==')'){
                count--;
            }
        }
        return nest;
    }
}
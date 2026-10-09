class Solution {
    public int minInsertions(String s) {
        int ans=0;
        int count=0;
        for(int i=0;i<s.length(); i++){
            if(s.charAt(i)=='('){
                count+=2;
                if(count%2!=0){
                    ans++;
                    count--;
                }
            }
            else{
                count--;
                if(count==-1){
                    ans++;
                    count=1;
                }
            }
        } 
        return ans+count;       
    }
}
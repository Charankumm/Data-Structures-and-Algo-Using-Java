class Solution {
    public int numberOfSteps(int num) {
        return rec(num,0);
    }
       
       private int rec(int n,int c){
        if(n==0){
            return c;
        }
        if(n%2==0){
            return rec(n/2, c+1);

        }
        else{
            return rec(n-1,c+1);
        }

       } 
    
}
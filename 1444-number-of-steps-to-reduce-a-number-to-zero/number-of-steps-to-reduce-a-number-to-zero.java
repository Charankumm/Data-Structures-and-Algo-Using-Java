class Solution {
    public int numberOfSteps(int num) {
        int count = 0;
        if(num==0){
            return 0;
        }
        if(num%2==1){
            return  count+1 + numberOfSteps(num-1);
        }
        if(num%2==0){
            
            return  count+1 + numberOfSteps(num/2);
            
        }
        return count;
        
           
        
        
    }
}
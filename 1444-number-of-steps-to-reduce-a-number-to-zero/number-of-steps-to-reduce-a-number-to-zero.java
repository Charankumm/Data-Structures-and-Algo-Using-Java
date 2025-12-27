class Solution {
    public int numberOfSteps(int num) {
        int count = 0;
        if(num==0){
            return 0;
        }
        if(num%2==1){
            return numberOfSteps(num-1) + count+1;
        }
        if(num%2==0){
            
            return numberOfSteps(num/2) + count+1;
            
        }
        return count;
        
           
        
        
    }
}
class Solution {
    public int maxProfit(int[] prices) {
        int minP=prices[0];
        int prof=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minP){
                minP=prices[i];
            }
            else if(prices[i]-minP>prof){
                prof=prices[i]-minP;
            }
            

            
        }
        return prof;
        
        
    }
}
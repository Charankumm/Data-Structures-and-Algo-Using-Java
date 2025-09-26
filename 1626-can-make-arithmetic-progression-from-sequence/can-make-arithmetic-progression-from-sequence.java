class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        for(int a=0;a<arr.length;a++){
            for(int b=1;b<arr.length-a;b++){
                if(arr[b]<arr[b-1]){
                    int temp = arr[b];
                    arr[b]=arr[b-1];
                    arr[b-1]= temp;
                }
            }
        }
        int diff = arr[0]-arr[1];
        for(int i=0;i<arr.length-1;i++){
            int diff1= arr[i]-arr[i+1];
            if(diff!=diff1){
                return false;
            }
        }
        return true;
        
        
    }
}
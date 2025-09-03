class Solution {
    public double average(int[] salary) {
        int sum=0;
        for(int i=0;i<salary.length;i++){
            for(int j=1;j<salary.length-i;j++){
                if(salary[j]<salary[j-1]){
                    int temp=salary[j-1];
                    salary[j-1]=salary[j];
                    salary[j]=temp;
                }
                
            }
        }
        for(int k=1;k<salary.length-1;k++){
            sum=sum+salary[k];
        }
        return (double)sum/(salary.length-2);   
        
    }
}
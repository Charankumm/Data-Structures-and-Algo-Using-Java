class Solution {
    public int reverseDegree(String s) {
        char al='a';
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=26;i>=1;i--){
            map.put(al,i);
            al+=1;
        }
        int sum=0;
        for(int j=0;j<s.length();j++){
            int product = (j+1)*map.get(s.charAt(j));
            sum=sum+product;

        }
        return sum;


        
    }
}
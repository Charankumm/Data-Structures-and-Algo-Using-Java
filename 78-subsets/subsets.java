class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        for(int i=0;i<nums.length;i++){
            int size = res.size();
            for(int j=0;j<size;j++){
                ArrayList<Integer> r1= new ArrayList<>(res.get(j));
                r1.add(nums[i]);
                res.add(r1);

            }
           
        }
        return res;
    }
}
class Solution {
    public void backtrack( List<List<Integer>> result, List<Integer> ans, boolean [] isVisit, int [] nums){
        if(ans.size() == nums.length){
            result.add(new ArrayList<>(ans));
            return ;
        }
        for(int  i =0; i< nums.length; i++){
            if(isVisit[i]) continue;
            isVisit[i] = true;
            ans.add(nums[i]);

            backtrack(result, ans, isVisit, nums);
            ans.remove(ans.size() -1);
            isVisit[i] = false;
        }

    }
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        boolean [] isVisit = new boolean [nums.length];
        backtrack(result, ans , isVisit, nums);
        
        return result;


        
    }
}
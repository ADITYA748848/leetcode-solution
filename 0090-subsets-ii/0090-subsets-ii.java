class Solution {
    public void backtrack(List<List<Integer>> result,List<Integer> ans, int start, int[] nums ){

        result.add( new ArrayList<>(ans));  // jab recursion start hota hai Tabhi yeh line run hoti hai → [] add ho jata hai

        for(int i = start ; i < nums.length; i++){
            if (i > start && nums[i] == nums[i - 1]) continue; // duplicate skip karne ka code
            ans.add(nums[i]);

            backtrack(result, ans, i + 1 , nums);
            ans.remove(ans.size() - 1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        
        backtrack(result, ans, 0, nums);
        return result;

        
    }
}
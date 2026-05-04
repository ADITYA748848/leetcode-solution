class Solution {

    public void solve(List<List<Integer>> result,List<Integer> curr,int start,int[] nums){
        result.add(new ArrayList<>(curr));

        for(int i = start ; i< nums.length; i++){
            curr.add(nums[i]);
            solve(result, curr, i + 1 , nums);
            curr.remove(curr.size() -1);

        }
        

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        solve(result,curr,0,nums);
        return result;
    }
}

 




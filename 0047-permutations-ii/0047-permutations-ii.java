class Solution {
    public void BackTrack( List<List<Integer>> result,  List<Integer> ans, boolean [] isvisit, int[] nums){
        if(ans.size() == nums.length){
            result.add(new ArrayList<>(ans));
            return ;

        }
        for(int i = 0; i<nums.length; i++){
            if(isvisit[i]) continue;
            // duplicate Remove karne ke liye niche wala line likha huwa hai 

            if (i > 0 && nums[i] == nums[i - 1] && !isvisit[i - 1]) continue;

            isvisit[i] = true;

            ans.add(nums[i]);

            BackTrack(result, ans, isvisit, nums);
            ans.remove(ans.size()-1);
            isvisit[i] = false;

        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
         // duplicates ko paas laata hai taaki comparison karna easy hoo jaye ;

        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ans =new ArrayList<>();
        boolean [] isvisit = new boolean[nums.length];
        BackTrack(result, ans, isvisit, nums);
        return result;
        
    }
}
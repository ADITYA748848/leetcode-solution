class Solution {

    void solve(int idx, int[] candidates, int target,
               List<Integer> curr, List<List<Integer>> ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        if (idx == candidates.length || target < 0) {
            return;
        }

        // Take current element
        curr.add(candidates[idx]);
        solve(idx, candidates, target - candidates[idx], curr, ans);

        // Backtrack
        curr.remove(curr.size() - 1);

        // Skip current element
        solve(idx + 1, candidates, target, curr, ans);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        solve(0, candidates, target, curr, ans);

        return ans;
    }
}
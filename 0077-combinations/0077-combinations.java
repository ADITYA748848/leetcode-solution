class Solution {

    public void backtrack(List<List<Integer>> result,List<Integer> ans,int start, int n , int k ){
        if(ans.size() == k){
            result.add(new ArrayList<>(ans));
            return;
        } 
        for(int i = start; i<= n; i++){
            ans.add(i);

            backtrack(result, ans, i + 1, n ,k);

            // BACKTRACKING USEING remove current element me se esliye karte taki or bhi possibility nikal saku 
            

            ans.remove(ans.size() -1);
        }

    }
    public List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> result = new ArrayList<>(n);
        List<Integer> ans = new ArrayList<>();
        backtrack(result, ans, 1 , n ,k);
        return result;



    }
}
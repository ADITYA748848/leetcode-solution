class Solution {
    int dp[][];
    public int solve(int m, int n , int  i, int j){
        if(i==m-1 && j==n-1){
            return 1;
        }
        if(i >=m || j >=n){
            return 0;
        }
       
        if (dp[i][j]!= -1) return dp[i][j];

        int down_i = solve(m,n, i+1, j);
        int right_j = solve(m,n, i, j+1);
        dp[i][j] = down_i + right_j;
        return dp[i][j];
    }

    public int uniquePaths(int m, int n) {
        dp = new int[m][n];

        for(int i =0; i< m; i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(m, n, 0, 0);
    }
}
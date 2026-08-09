class Solution {
    int dp[][];
    public int solve(int[][] obstacleGrid, int m, int n , int i , int  j ){
        if(i>=m || j>= n) return 0;
        if(obstacleGrid[i][j] == 1) return 0;
        
        if(i == m -1 && j == n-1) return 1;
        if(dp[i][j] != -1) return dp[i][j];

        int right = solve(obstacleGrid,m,n,i,j+1);
        int down = solve(obstacleGrid,m,n,i+1, j);
        

        dp[i][j] = right + down;
        return dp[i][j];
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        dp = new int[m][n]; 
        for(int i = 0; i<m; i++){
            Arrays.fill(dp[i], -1);

        }
        return  solve(obstacleGrid,m,n, 0, 0);
    }
}
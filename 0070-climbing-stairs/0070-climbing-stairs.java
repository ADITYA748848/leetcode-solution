class Solution {
    int [] dp;
    public int solve ( int i, int n){
      
        if(i==n) return 1;
        if(i>n) return 0;

        if(dp[i]!=-1) return dp[i];
        int take1 = solve(i+1,n);
        int take2 = solve(i+2,n);

        return dp[i] =  take1 + take2;     
    }
    public int climbStairs(int n) {
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        return solve ( 0, n);
        
    }
}
class Solution {
    public long solution(int n) {
        long answer = 0;

        if (n == 1)
            return 1;
        else if (n == 2)
            return 2;
        else if (n == 3)
            return 3;
        
        long[] dp = new long[n+1];
        
        dp[1] = 1; dp[2] = 2; dp[3] = 3;
        for (int i = 4; i <= n; i++)
            dp[i] = (dp[i-1] + dp[i-2]) % 1234567;
        
        return dp[n];
    }
}
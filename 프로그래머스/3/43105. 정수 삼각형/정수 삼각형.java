class Solution {
    public int solution(int[][] triangle) {
        int lastRowSize = triangle.length-1;
        int size = triangle.length;
        
        int[][] dp = new int[size][triangle[lastRowSize].length];
        
        dp[0][0] = triangle[0][0];
        dp[1][0] = dp[0][0] + triangle[1][0];
        dp[1][1] = dp[0][0] + triangle[1][1];
        
        int max = Math.max(dp[1][0], dp[1][1]);
        for (int i = 2; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                if (j > 0)
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-1]) + triangle[i][j];
                else
                    dp[i][j] = dp[i-1][j] + triangle[i][j];
                
                if (dp[i][j] > max)
                    max = dp[i][j];
            }
        }
        
        return max;
    }
}
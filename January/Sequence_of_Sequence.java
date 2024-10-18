class Sequence_of_Sequence {
    static int numberSequence(int m, int n) {
        int[][] dp = new int[n + 1][m + 1];

        for (int i = 0; i <= m; i++)
            dp[0][i] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                dp[i][j] = dp[i - 1][j / 2] + dp[i][j - 1];
            }
        }
        return dp[n][m];
    }
}
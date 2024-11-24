class Count_digit_groupings_of_a_number {
    public int TotalCount(String str) {
        // Code here
        int i, j, sum = 0, ans = 1, n = str.length();
        int[][] sums = new int[n][n];

        for (i = 0; i < n; i++) {
            for (j = i; j < n; j++) {
                if (i == j)
                    sums[i][j] = str.charAt(j) - '0';
                else
                    sums[i][j] = sums[i][j - 1] + (str.charAt(j) - '0');
            }
        }

        int[][] dp = new int[n][n];

        Arrays.fill(dp[0], 1);
        for (i = 1; i < n; i++) {
            for (j = i; j < n; j++) {
                for (int k = 0; k <= i - 1; k++) {
                    if (sums[k][i - 1] <= sums[i][j])
                        dp[i][j] += dp[k][i - 1];
                }

            }
            ans += dp[i][n - 1];
        }

        return ans;
    }
}
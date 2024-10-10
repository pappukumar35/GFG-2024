class Count_possible_ways_to_construct_buildings {
    public int TotalWays(int N) {
        // Code here
        int mod = 1000000007;
        long[] dp = new long[N + 1];

        dp[0] = 1;
        dp[1] = 2;

        for (int i = 2; i <= N; i++)
            dp[i] = (dp[i - 1] + dp[i - 2]) % mod;

        return (int) ((dp[N] * dp[N]) % mod);
    }
}
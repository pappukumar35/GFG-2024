public class New_year_regulation {
    private static boolean solve(int arr[], int sum, int idx, Boolean dp[][]) {
        if (idx == arr.length)
            return sum != 0 && (sum % 20 == 0 || sum % 24 == 0 || sum == 2024);
        if ((sum != 0 && (sum % 20 == 0) || (sum == 2024)))
            return true;
        if (dp[idx][sum] != null)
            return dp[idx][sum];
        boolean pick = solve(arr, sum + arr[idx], idx + 1, dp);
        boolean notpick = solve(arr, sum, idx + 1, dp);
        return dp[idx][sum] = pick || notpick;
    }

    public static boolean isPossible(int N, int[] coins) {
        Boolean dp[][] = new Boolean[N + 1][2025];
        return solve(coins, 0, 0, dp);
    }
}

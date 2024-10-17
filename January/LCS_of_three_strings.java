class LCS_of_three_strings {
    int[][][] memo;

    int solve(String A, String B, String C, int i, int j, int k, int n1, int n2, int n3) {
        if (i == n1 || j == n2 || k == n3)
            return 0;

        if (memo[i][j][k] != -1)
            return memo[i][j][k];

        if (A.charAt(i) == B.charAt(j) && A.charAt(i) == C.charAt(k))
            return memo[i][j][k] = 1 + solve(A, B, C, i + 1, j + 1, k + 1, n1, n2, n3);

        return memo[i][j][k] = Math.max(
                Math.max(solve(A, B, C, i + 1, j, k, n1, n2, n3),
                        solve(A, B, C, i, j + 1, k, n1, n2, n3)),
                solve(A, B, C, i, j, k + 1, n1, n2, n3));
    }

    int LCSof3(String A, String B, String C, int n1, int n2, int n3) {
        memo = new int[n1][n2][n3];

        for (int i = 0; i < n1; ++i) {
            for (int j = 0; j < n2; ++j) {
                for (int k = 0; k < n3; ++k) {
                    memo[i][j][k] = -1;
                }
            }
        }

        return solve(A, B, C, 0, 0, 0, n1, n2, n3);
    }
}
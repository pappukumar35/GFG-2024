class GrindingGeek {
    int[][] dp;

    public int max_courses(int n, int total, int[] cost) {
        dp = new int[n + 1][total + 1];
        Arrays.stream(dp).forEach(arr -> Arrays.fill(arr, -1));
        return findMaxCourses(n, total, cost, 0);
    }

    public int findMaxCourses(int n, int total, int[] cost, int currentIndex) {
        if (total <= 0 || currentIndex >= n) {
            return 0;
        } else if (dp[currentIndex][total] != -1) {
            return dp[currentIndex][total];
        }

        int consider = 0, notConsider = 0;

        if (total >= cost[currentIndex]) {
            int newTotal = (int) Math.floor(total - cost[currentIndex] * 0.10);
            consider = 1 + findMaxCourses(n, newTotal, cost, currentIndex + 1);
        }

        notConsider = findMaxCourses(n, total, cost, currentIndex + 1);

        return dp[currentIndex][total] = Math.max(consider, notConsider);

    }
}
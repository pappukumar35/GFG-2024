import java.util.*;

public class Maximize_dot_product {
     public int maxDotProduct(int n, int m, int a[], int b[]) {
          int[][] dp = new int[n][m];
          for (int[] dr : dp)
               Arrays.fill(dr, -1);
          return solve(n - 1, m - 1, a, b, n - m, dp);
     }

     private int solve(int i, int j, int[] a, int[] b, int gap, int[][] dp) {
          if (i < 0 || j < 0)
               return 0;
          if (dp[i][j] != -1)
               return dp[i][j];
          int take = a[i] * b[j] + solve(i - 1, j - 1, a, b, gap, dp);
          int not_take = Integer.MIN_VALUE;
          if (gap > 0)
               not_take = solve(i - 1, j, a, b, gap - 1, dp);
          return dp[i][j] = Math.max(take, not_take);
     }

     public static void main(String[] args) {

     }
}

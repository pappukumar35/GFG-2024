package May;

import java.util.*;

public class Minimum_Cost_To_Make_Two_Strings_Identical {

     public int findMinCost(String x, String y, int costX, int costY) {
          int n = x.length();
          int m = y.length();

          // Create a 2D array to store the lengths of LCS
          int[][] dp = new int[n + 1][m + 1];

          // Fill the dp tableA
          for (int i = 1; i <= n; i++) {
               for (int j = 1; j <= m; j++) {
                    if (x.charAt(i - 1) == y.charAt(j - 1)) {
                         dp[i][j] = 1 + dp[i - 1][j - 1];
                    } else {
                         dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                    }
               }
          }

          int lcsLength = dp[n][m];
          int minCost = (n - lcsLength) * costX + (m - lcsLength) * costY;

          return minCost;
     }

     public static void main(String[] args) {

     }
}
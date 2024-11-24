import java.util.*;

public class Minimum_Points_To_Reach_Destination {
     public int minPoints(int points[][], int m, int n) {
          int[][] dp = new int[m][n];
          dp[m - 1][n - 1] = Math.max(1, 1 - points[m - 1][n - 1]);
          for (int i = m - 1; i >= 0; i--) {
               for (int j = n - 1; j >= 0; j--) {
                    if (i == m - 1 && j == n - 1)
                         continue;
                    int minPointsRequired = Integer.MAX_VALUE;
                    if (i + 1 < m)
                         minPointsRequired = Math.min(minPointsRequired, dp[i + 1][j]);
                    if (j + 1 < n)
                         minPointsRequired = Math.min(minPointsRequired, dp[i][j + 1]);
                    dp[i][j] = Math.max(1, minPointsRequired - points[i][j]);
               }
          }
          return dp[0][0];
     }

     public static void main(String args[]) {

     }
}

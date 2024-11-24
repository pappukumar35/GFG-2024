import java.util.*;
import java.util.*;

public class Paths_to_reach_origin {
     public static int ways(int n, int m) {
          // complete the function
          int dp[][] = new int[n + 1][m + 1];
          for (int i[] : dp) {
               Arrays.fill(i, -1);
          }
          return solve(n, m, dp);
     }

     public static int solve(int i, int j, int dp[][]) {
          if (i < 0 || j < 0) {
               return 0;
          }
          if (i == 0 && j == 0) {
               return 1;
          }
          if (dp[i][j] != -1) {
               return dp[i][j];
          }
          int l = solve(i - 1, j, dp);
          int r = solve(i, j - 1, dp);
          return dp[i][j] = (l + r) % 1000000007;
     }

     public static void main(String[] args) {

     }
}
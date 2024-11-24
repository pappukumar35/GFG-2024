package June;

import java.util.*;

public class Mobile_numeric_keypad {
     public long getCount(int n) {
          if (n == 1) {
               return 10;
          }
          int[][] arr = {
                    { 0, 8 },
                    { 1, 2, 4 },
                    { 1, 2, 3, 5 },
                    { 2, 3, 6 },
                    { 1, 4, 5, 7 },
                    { 2, 4, 5, 6, 8 },
                    { 3, 5, 6, 9 },
                    { 4, 7, 8 },
                    { 0, 5, 7, 8, 9 },
                    { 6, 8, 9 }
          };
          long[][] dp = new long[n + 1][10];
          for (int i = 0; i <= 9; ++i) {
               dp[1][i] = 1;
          }
          for (int i = 2; i <= n; i++) {
               for (int j = 0; j < 10; j++) {
                    dp[i][j] = 0;
                    for (int x : arr[j]) {
                         dp[i][j] += dp[i - 1][x];
                    }
               }
          }
          long ans = 0;
          for (int i = 0; i <= 9; ++i) {
               ans += dp[n][i];
          }
          return ans;
     }

     public static void main(String[] args) {

     }
}
package July;

import java.util.*;

public class Form_a_palindrome {
     static int countMin(String str) {
          // code here
          int n = str.length();

          int[][] dp = new int[n][n];

          for (int i = 2; i <= n; i++) {
               for (int j = 0; j <= n - i; j++) {
                    int k = j + i - 1;
                    if (str.charAt(j) == str.charAt(k)) {
                         dp[j][k] = dp[j + 1][k - 1];
                    } else {
                         dp[j][k] = Math.min(dp[j + 1][k], dp[j][k - 1]) + 1;
                    }
               }
          }
          return dp[0][n - 1];
     }

     public static void main(String[] args) {

     }
}
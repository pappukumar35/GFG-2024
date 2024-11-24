package Sepetember;

public class Minimum_number_of_deletions_and_insertions {
     public int minOperations(String str1, String str2) {
          // Your code goes here
          int[][] dp = new int[str1.length() + 1][str2.length() + 1];
          for (int i = 1; i < dp.length; i++) {
               for (int j = 1; j < dp[0].length; j++) {
                    if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                         dp[i][j] = 1 + dp[i - 1][j - 1];
                    } else {
                         dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                    }
               }
          }

          int commonLen = dp[str1.length()][str2.length()];
          return (str1.length() - commonLen) + (str2.length() - commonLen);
     }

     public static void main(String[] args) {

     }
}
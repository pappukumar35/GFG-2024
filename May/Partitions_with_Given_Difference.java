package May;

import java.util.*;
import java.util.Arrays;

public class Partitions_with_Given_Difference {
     static int mod = 1000000007;

     public static int countPartitions(int n, int d, int[] arr) {
          // code here
          int sum = 0;
          for (int i = 0; i < n; i++) {
               sum += arr[i];
          }
          int dp[][] = new int[n][sum + 1];
          for (int[] x : dp) {
               Arrays.fill(x, -1);
          }
          return rep(n, d, sum, arr, 0, 0, dp);
     }

     public static int rep(int n, int d, int sum, int arr[], int temp, int ind, int dp[][]) {
          if ((sum - temp - temp) < d)
               return 0;
          if (ind == n) {
               int secondsum = sum - temp;
               if (secondsum - temp == d)
                    return 1;

               return 0;
          }
          if (dp[ind][temp] != -1)
               return dp[ind][temp];
          int a = rep(n, d, sum, arr, temp, ind + 1, dp);
          int b = rep(n, d, sum, arr, temp + arr[ind], ind + 1, dp);
          return dp[ind][temp] = (a + b) % mod;
     }

     public static void main(String[] args) {

     }
}
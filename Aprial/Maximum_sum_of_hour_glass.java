import java.util.*;

public class Maximum_sum_of_hour_glass {
     int findMaxSum(int n, int m, int mat[][]) {
          // code here
          if (n < 3 || m < 3) {
               return -1;
          }
          int[][] arr = new int[n + 1][m + 1];
          for (int i = 1; i <= n; i++) {
               for (int j = 1; j <= m; j++) {
                    arr[i][j] = arr[i - 1][j] + arr[i][j - 1] + mat[i - 1][j - 1] - arr[i - 1][j - 1];
               }
          }
          int maxsum = -1;
          for (int i = 3; i < n + 1; i++) {
               for (int j = 3; j < m + 1; j++) {
                    int sum = arr[i][j] - arr[i][j - 3] - arr[i - 3][j] + arr[i - 3][j - 3] - mat[i - 2][j - 1]
                              - mat[i - 2][j - 3];
                    maxsum = Math.max(maxsum, sum);
               }
          }
          return maxsum;
     }

     public static void main(String[] args) {

     }
}
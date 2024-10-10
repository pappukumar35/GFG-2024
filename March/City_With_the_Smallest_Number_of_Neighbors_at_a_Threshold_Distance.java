
import java.io.*;
import java.util.*;

class City_With_the_Smallest_Number_of_Neighbors_at_a_Threshold_Distance {
     int findCity(int n, int m, int[][] edges, int distanceThreshold) {
          int min = 101;
          int ans = 0;
          int[][] mat = new int[n][n];

          // fill array with max value
          for (int[] mm : mat) {
               Arrays.fill(mm, 10001);
          }

          // make diagonal 0
          for (int i = 0; i < n; i++) {
               mat[i][i] = 0;
          }

          // fill mat with given edge weight
          for (int[] edge : edges) {
               mat[edge[0]][edge[1]] = mat[edge[1]][edge[0]] = edge[2];
          }

          // find min value from each vertex
          for (int k = 0; k < n; k++) {
               for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                         mat[i][j] = Math.min(mat[i][j], mat[i][k] + mat[k][j]);
                    }
               }
          }

          // count nodes whose weight less than distanceThreshold
          for (int i = 0; i < n; i++) {
               int cnt = 0;
               for (int j = 0; j < n; j++) {
                    if (mat[i][j] <= distanceThreshold) {
                         cnt++;
                    }
               }
               min = Math.min(cnt, min);
               if (min == cnt) {
                    ans = i;
               }
          }
          return ans;
     }

     public static void main(String[] args) {

     }
}
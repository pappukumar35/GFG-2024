package June;

import java.util.*;

public class Left_Rotate_Matrix_K_times {
     int[][] rotateMatrix(int k, int mat[][]) {
          // code here
          int n = mat.length;
          int m = mat[0].length;
          int[][] res = new int[n][m];
          k %= m;
          if (k == 0) {
               return mat;
          }
          for (int i = 0; i < m; i++) {
               for (int j = 0; j < n; j++) {
                    res[j][i] = mat[j][(i + k) % m];
               }
          }
          return res;
     }

     public static void main(String[] args) {

     }
}
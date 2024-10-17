package June;

import java.util.*;

public class Coverage_of_all_Zeros_in_a_Binary_Matrix {
     public int findCoverage(int[][] matrix) {
          // code here
          int c = 0;
          int n = matrix.length;
          int m = matrix[0].length;
          for (int i = 0; i < n; i++) {
               for (int j = 0; j < m; j++) {
                    if (matrix[i][j] == 0) {
                         if (j + 1 < m) {
                              if (matrix[i][j + 1] == 1) {
                                   c++;
                              }
                         }
                         if (j - 1 >= 0) {
                              if (matrix[i][j - 1] == 1) {
                                   c++;
                              }
                         }
                         if (i - 1 >= 0) {
                              if (matrix[i - 1][j] == 1) {
                                   c++;
                              }
                         }
                         if (i + 1 < n) {
                              if (matrix[i + 1][j] == 1) {
                                   c++;
                              }
                         }
                    }
               }
          }
          return c;
     }

     public static void main(String[] args) {

     }
}
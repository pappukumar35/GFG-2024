package June;

import java.util.*;

public class Toeplitz_matrix {
     boolean isToeplitz(int mat[][]) {
          int rows = mat.length;
          int cols = mat[0].length;

          for (int i = 1; i < rows; i++) {
               for (int j = 1; j < cols; j++) {
                    if (mat[i][j] != mat[i - 1][j - 1]) {
                         return false;
                    }
               }
          }
          return true;
     }

     public static void main(String[] args) {

     }

}
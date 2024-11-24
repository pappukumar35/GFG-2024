package July;

import java.util.*;

public class Largest_square_formed_in_a_matrix {
     static int maxSquare(int n, int m, int mat[][]) {
          int ans = 0; // Initialize the maximum size of the square

          // Traverse the entire matrix
          for (int i = 0; i < n; i++) {
               for (int j = 0; j < m; j++) {
                    if (i == 0 || j == 0) {
                         // If we are at the first row or first column, take the value as it is
                         ans = Math.max(ans, mat[i][j]);
                    } else if (mat[i][j] != 0) {
                         // If the current cell is not zero, update it with the size of the square it can
                         // form
                         mat[i][j] += Math.min(mat[i - 1][j], Math.min(mat[i - 1][j - 1], mat[i][j - 1]));
                         ans = Math.max(ans, mat[i][j]); // Update the answer with the maximum size found
                    }
               }
          }
          return ans; // Return the maximum size of the square
     }

     public static void main(String[] args) {

     }
}
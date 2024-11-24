class Print_matrix_in_diagonal_pattern {
     public int[] matrixDiagonally(int[][] mat) {

          int n = mat.length;
          int m = mat[0].length;
          int[] ans = new int[n * m];
          int row = 0;
          int col = 0;
          int k = 0;
          boolean up = true;
          while (row < n && col < m) {

               if (up == true) {
                    while (row > 0 && col < m - 1) {
                         ans[k++] = mat[row][col];
                         row--;
                         col++;
                    }
                    ans[k++] = mat[row][col];
                    if (col == m - 1)
                         row++;
                    else
                         col++;
               } else {
                    while (row < n - 1 && col > 0) {
                         ans[k++] = mat[row][col];
                         row++;
                         col--;
                    }
                    ans[k++] = mat[row][col];
                    if (row == n - 1)
                         col++;
                    else
                         row++;
               }
               up = !up;
          }
          return ans;

     }
}
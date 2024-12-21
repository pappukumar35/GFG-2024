package December;

public class Rotate_by_90_degree {
     static void rotateby90(int matrix[][]) {
          int n = matrix.length;

          // Step 1: Transpose the matrix (swap rows with columns)
          for (int i = 0; i < n; i++) {
               for (int j = 0; j < i; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
               }
          }

          // Step 2: Reverse each column to get the rotated matrix
          for (int j = 0; j < n; j++) {
               int top = 0, bottom = n - 1;
               while (top < bottom) {
                    int temp = matrix[top][j];
                    matrix[top][j] = matrix[bottom][j];
                    matrix[bottom][j] = temp;
                    top++;
                    bottom--;
               }
          }
     }

     public static void main(String[] args) {

          int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
          int m = arr.length;
          for (int i = 0; i < m; i++) {
               for (int j = 0; j < i; j++) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;

               }
          }

          // roted
          for (int i = 0; i < m; i++) {
               int a = 0, b = m - 1;
               while (a < b) {
                    int temp = arr[i][a];
                    arr[i][a] = arr[i][b];
                    arr[i][b] = temp;
                    a++;
                    b--;
               }
          }

     }

}
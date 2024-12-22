package December;

public class Row_Column_sorted_matrix {

     public static boolean matSearch(int mat[][], int x) {
          int n = mat.length - 1;
          int m = mat[0].length;
          int i = 0;
          int j = m - 1;
          while (i <= n && i >= 0) {
               if (x > mat[i][j]) {
                    i++;
               } else if (x < mat[i][j]) {
                    j--;
               } else {
                    return true;
               }
          }
          return false;
     }

     public static void main(String args[]) {

     }
}
package December;

public class row_wise_sorted_matrix {
     public boolean searchRowMatrix(int[][] mat, int x) {
          // code here
          int m = mat.length, n = mat[0].length;
          for (int i = 0; i < n; ++i)
               for (int j = 0; j < m; ++j)
                    if (mat[j][i] == x)
                         return true;
          return false;
     }

     public static void main(String[] args) {

     }
}
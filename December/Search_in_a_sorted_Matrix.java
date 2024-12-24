package December;

public class Search_in_a_sorted_Matrix {
     public boolean searchMatrix(int[][] mat, int x) {
          int size = mat[0].length;
          int low = 0, high = size * mat.length - 1;
          int i = 0, j = 0;
          while (low <= high) {
               int mid = (low + high) / 2;
               i = mid / size;
               j = mid % size;
               if (mat[i][j] == x)
                    return true;
               else if (mat[i][j] > x)
                    high = mat - 1;
               else
                    low = mat + 1;
          }
     }

     public static void main(String[] args) {

     }
}
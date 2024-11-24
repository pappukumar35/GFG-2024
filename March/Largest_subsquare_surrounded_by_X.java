class Largest_subsquare_surrounded_by_X {
     int largestSubsquare(int n, char a[][]) {
          int row[][] = new int[n][n];
          int col[][] = new int[n][n];
          for (int i = 0; i < n; i++) {
               int r = 0, c = 0;
               for (int j = 0; j < n; j++) {
                    r = a[i][j] == 'X' ? ++r : 0;
                    c = a[j][i] == 'X' ? ++c : 0;
                    row[i][j] = r;
                    col[j][i] = c;
               }
          }
          int res = 0;
          for (int i = n - 1; i >= 0; i--) {
               for (int j = n - 1; j >= 0; j--) {
                    int s = Math.min(row[i][j], col[i][j]);
                    while (s > res) {
                         if (row[i - s + 1][j] >= s && col[i][j - s + 1] >= s)
                              res = s;
                         else
                              s--;
                    }
               }
          }
          return res;
     }

     public static void main(String[] args) {

     }
}
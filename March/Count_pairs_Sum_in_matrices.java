class Count_pairs_Sum_in_matrices {
     int countPairs(int mat1[][], int mat2[][], int n, int x) {
          int count = 0;
          HashSet<Integer> hs = new HashSet<>();
          for (int i = 0; i < n; i++) {
               for (int j = 0; j < n; j++) {
                    hs.add(mat1[i][j]);
               }
          }
          for (int i = 0; i < n; i++) {
               for (int j = 0; j < n; j++) {
                    if (hs.contains(x - mat2[i][j])) {
                         count++;
                    }
               }
          }
          return count;
     }

     public static void main(String[] args) {

     }
}
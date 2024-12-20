package December;
public class traversing_a_matrix{
     public ArrayList<Integer> spirallyTraverse(int mat[][]) {
          // code here
          int m = mat.length, n = mat[0].length, total = m * n;
          int sr = 0, er = m - 1;
          int sc = 0, ec = n - 1;
          ArrayList<Integer> list = new ArrayList<>();
          
          while (list.size() < total) {
              for (int i = sc; i <= ec && list.size() < total; i++) list.add(mat[sr][i]);
              sr++;
              for (int i = sr; i <= er && list.size() < total; i++) list.add(mat[i][ec]);
              ec--;
              for (int i = ec; i >= sc && list.size() < total; i--) list.add(mat[er][i]);
              er--;
              for (int i = er; i >= sr && list.size() < total; i--) list.add(mat[i][sc]);
              sc++;
          }
          
          return list;
      }
     public static void main(String[] args) {
          
     }
}
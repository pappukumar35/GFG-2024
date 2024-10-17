package Auguest;

import java.util.ArrayList;

public class N_Queen_Problem {
     public boolean validate(int i, int j, int b[][]) {
          int ci = i, cj = j;
          while (cj >= 0)
               if (b[ci][cj--] == 1)
                    return false;
          ci = i;
          cj = j;
          while (ci >= 0 && cj >= 0)
               if (b[ci--][cj--] == 1)
                    return false;
          ci = i;
          cj = j;
          while (ci < b.length && cj >= 0)
               if (b[ci++][cj--] == 1)
                    return false;
          return true;
     }

     public void dfs(int j, ArrayList<Integer> al, ArrayList<ArrayList<Integer>> ans, int n, int b[][]) {
          if (j == n) {
               ans.add(new ArrayList<>(al));
               return;
          }
          for (int i = 0; i < n; i++) {
               if (validate(i, j, b)) {
                    b[i][j] = 1;
                    al.add(i + 1);
                    dfs(j + 1, al, ans, n, b);
                    b[i][j] = 0;
                    al.remove(al.size() - 1);
               }
          }
     }

     public ArrayList<ArrayList<Integer>> nQueen(int n) {
          // code here
          ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
          int[][] b = new int[n][n];
          dfs(0, new ArrayList<>(), ans, n, b);
          return ans;
     }

     public static void main(String[] args) {

     }
}
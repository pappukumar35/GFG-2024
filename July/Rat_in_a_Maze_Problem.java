package july;

import java.util.*;

public class Rat_in_a_Maze_Problem {
     public ArrayList<String> findPath(int[][] mat) {
          ArrayList<String> res = new ArrayList<>();
          recurse(mat, 0, 0, "", res);
          return res;
     }

     static void recurse(int[][] mat, int r, int c, String res, ArrayList<String> ans) {
          if (r == mat.length - 1 && c == mat[0].length - 1 && mat[r][c] == 1) {
               ans.add(res);
               return;
          }
          if (r < 0 || r >= mat.length || c < 0 || c >= mat[0].length)
               return;
          if (mat[r][c] == 0 || mat[r][c] == -1)
               return;
          mat[r][c] = -1;

          recurse(mat, r - 1, c, res + "U", ans);
          recurse(mat, r + 1, c, res + "D", ans);
          recurse(mat, r, c - 1, res + "L", ans);
          recurse(mat, r, c + 1, res + "R", ans);
          mat[r][c] = 1;

     }

     public static void main(String[] args) {

     }
}
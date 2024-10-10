package June;

import java.util.*;

public class The_Palindrome_Pattern {
     public String pattern(int[][] arr) {
          // Code here
          int row = arr.length;
          int col = arr[0].length;
          for (int i = 0; i < row; i++) {
               int count = 0;
               int s = 0;
               int e = col - 1;
               while (s <= e) {
                    if (arr[i][s] != arr[i][e]) {
                         count = 1;
                         break;
                    }
                    e--;
                    s++;
               }
               if (count == 0) {
                    String ans = Integer.toString(i) + " " + "R";
                    return ans;
               }
          }
          for (int i = 0; i < col; i++) {
               int count = 0;
               int s = 0;
               int e = row - 1;
               while (s <= e) {
                    if (arr[s][i] != arr[e][i]) {
                         count = 1;
                         break;
                    }
                    e--;
                    s++;
               }
               if (count == 0) {
                    String ans = Integer.toString(i) + " " + "C";
                    return ans;
               }
          }

          return "-1";
     }

     public static void main(String[] args) {

     }
}

package December;

import java.util.ArrayList;
import java.util.Arrays;

public class Insert_Interval {
     static ArrayList<int[]> insertInterval(int[][] arr, int[] newArr) {
          ArrayList<int[]> ans = new ArrayList<>();

          int newTemp[][] = new int[arr.length + 1][2];
          for (int i = 0; i < arr.length; i++) {
               newTemp[i][0] = arr[i][0];
               newTemp[i][1] = arr[i][1];
          }

          int ns = newArr[0];
          int ne = newArr[1];
          newTemp[arr.length][0] = ns;
          newTemp[arr.length][1] = ne;

          Arrays.sort(newTemp, (a, b) -> (a[0] - b[0]));
          int n = newTemp.length;
          ns = -1;
          ne = -1;
          int i = 0;
          for (i = 1; i < n; i++) {
               if (newTemp[i - 1][1] >= newTemp[i][0]) {
                    ns = Math.min(newTemp[i - 1][0], newTemp[i][0]);
                    ne = Math.max(newTemp[i - 1][1], newTemp[i][1]);
                    // System.out.println(ne);
                    while (i < newTemp.length && ne >= newTemp[i][0]) {
                         ne = Math.max(ne, newTemp[i][1]);
                         i++;
                    }

                    ans.add(new int[] { ns, ne });

               } else {
                    ans.add(new int[] { newTemp[i - 1][0], newTemp[i - 1][1] });
               }
          }

          if (i <= newTemp.length)
               ans.add(new int[] { newTemp[i - 1][0], newTemp[i - 1][1] });
          return ans;
     }

     public static void main(String[] args) {

     }
}
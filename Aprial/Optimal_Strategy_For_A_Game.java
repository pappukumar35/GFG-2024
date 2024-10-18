
import java.io.*;
import java.util.*;

public class Optimal_Strategy_For_A_Game {
     static long countMaximum(int n, int[] arr) {
          long prev[] = new long[n + 1], prev2[] = new long[n + 1], cur[] = new long[n + 1];

          for (int i = n - 1; i >= 0; i--) {
               for (int j = i; j < n; j++) {
                    long tookFirst = arr[i];
                    if (i + 2 < n && j >= 1) {
                         tookFirst += Math.min(prev2[j], prev[j - 1]);
                    }
                    long tookLast = arr[j];
                    if (i + 1 < n && j >= 2) {
                         tookLast += Math.min(cur[j - 2], prev[j - 1]);
                    }

                    cur[j] = Math.max(tookFirst, tookLast);
               }
               System.arraycopy(prev, 0, prev2, 0, n + 1);
               System.arraycopy(cur, 0, prev, 0, n + 1);
          }

          return prev[n - 1];
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int t = sc.nextInt();
          while (t-- > 0) {
               int n = sc.nextInt();
               int arr[] = new int[n];
               for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
               }
               System.out.println(countMaximum(n, arr));

          }

     }
}

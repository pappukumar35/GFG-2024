import java.io.*;
import java.util.*;

public class Count_the_elements {
     public static int[] countElements(int a[], int b[], int n, int query[], int q) {
          int[] ans = new int[q];
          Arrays.sort(b);

          for (int i = 0; i < query.length; i++) {
               int idx = query[i];
               int ele = a[idx];

               int cnt = 0;
               for (int j = 0; j < n; j++) {
                    if (ele - b[j] >= 0) {
                         cnt++;
                    } else {
                         break;
                    }
               }
               ans[i] = cnt;
          }

          return ans;
     }

     public static void main(String[] args) {

     }
}
import java.util.*;

public class Minimize_the_Difference {
     public static int minimizeDifference(int n, int k, int[] arr) {
          // code here
          int rightmx[] = new int[n];
          int rightmn[] = new int[n];
          rightmx[n - 1] = arr[n - 1];
          rightmn[n - 1] = arr[n - 1];
          for (int i = n - 2; i >= 0; i--) {
               rightmn[i] = Math.min(rightmn[i + 1], arr[i]);
               rightmx[i] = Math.max(rightmx[i + 1], arr[i]);
          }
          int i = 0, j = k - 1, mn = Integer.MAX_VALUE, mx = Integer.MIN_VALUE, ans = Integer.MAX_VALUE;
          while (j < n) {
               if (i != 0) {
                    mn = Math.min(arr[i - 1], mn);
                    mx = Math.max(arr[i - 1], mx);
               }
               int temp1 = mx, temp2 = mn;
               if (j != n - 1) {
                    temp1 = Math.max(mx, rightmx[j + 1]);
                    temp2 = Math.min(mn, rightmn[j + 1]);
               }
               ans = Math.min(ans, Math.abs(temp1 - temp2));
               i++;
               j++;
          }
          return ans;
     }

     public static void main(String[] args) {

     }
}

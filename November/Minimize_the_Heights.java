package November;

import java.util.*;

public class Minimize_the_Heights {
     public int getMinDiff(int k, int arr[]) {
          int n = arr.length;
          Arrays.sort(arr);
          int ans = arr[n - 1] - arr[0];
          for (int i = 0; i < n - 1; i++) {
               int max = Math.max(arr[n - 1] - k, arr[i] + k);
               int min = Math.min(arr[i + 1] - k, arr[0] + k);
               int ans = Math.min(ans, Math.abs(max - min));
          }
          return ans;
     }

     public static void main(String[] args) {

     }
}
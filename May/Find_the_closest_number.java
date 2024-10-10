package May;

import java.util.*;

public class Find_the_closest_number {
     public static int findClosest(int n, int k, int[] arr) {
          // code here
          int diff = Integer.MAX_VALUE;
          int ans = arr[0];
          for (int i = 0; i < n; i++) {
               if (Math.abs(k - arr[i]) <= diff) {
                    diff = k - arr[i];
                    ans = arr[i];
               }
          }
          return ans;
     }

     public static void main(String[] args) {

     }
}
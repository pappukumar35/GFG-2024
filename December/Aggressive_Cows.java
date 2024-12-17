package December;

import java.util.Arrays;

public class Aggressive_Cows {
     static boolean isPossible(int[] stalls, int min_dis, int l, int n) {
          int k = 1;
          int laststall = stalls[0];
          for (int i = 1; i < l; i++) {
               if (stalls[i] - laststall >= min_dis) {
                    k++;
                    laststall = stalls[i];
               }
          }
          return k >= n;
     }

     public static int aggressiveCows(int[] stalls, int k) {
          // code here
          int l = stalls.length;
          Arrays.sort(stalls);
          int str = 1;
          int end = stalls[l - 1] - stalls[0];
          int ans = 0;
          while (str <= end) {
               int mid = str + (end - str) / 2;
               if (isPossible(stalls, mid, l, k)) {
                    ans = mid;
                    str = mid + 1;
               } else {
                    end = mid - 1;
               }
          }
          return ans;
     }

     public static void main(String[] args) {

     }
}
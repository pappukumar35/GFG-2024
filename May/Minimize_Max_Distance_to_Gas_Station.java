package May;

import java.util.*;

public class Minimize_Max_Distance_to_Gas_Station {

     static double findSmallestMaxDist(int a[], int k) {
          int n = a.length;
          double l = 0, r = maxDist(a);
          while (l + 1e-6 < r) {
               double mid = (r + l) / 2;
               if (possible(a, n, k, mid)) {
                    r = mid;
               } else {
                    l = mid;
               }
          }
          return r;
     }

     static boolean possible(int a[], int n, int k, double mid) {
          int req = 0;
          for (int i = 1; i < n; i++) {
               double diff = a[i] - a[i - 1];
               req += Math.ceil(diff / mid) - 1;
          }
          return req <= k;
     }

     static double maxDist(int a[]) {
          int n = a.length;
          double maxDist = 0.0;
          for (int i = 1; i < n; i++)
               maxDist = Math.max(maxDist, a[i] - a[i - 1]);
          return maxDist;
     }

     public static void main(String[] args) {

     }
}
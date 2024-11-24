package June;

import java.util.*;

public class Trail_of_ones {
     static int numberOfConsecutiveOnes(int n) {
          if (n == 2)
               return 1;
          int a = 0, b = 1;
          int ans = 1;
          int mod = 1_000_000_007;
          for (int i = 3; i <= n; i++) {
               int c = (a + b) % mod;
               a = b;
               b = c;
               ans = ((ans * 2) % mod + c) % mod;
          }
          return ans;
     }

     public static void main(String[] args) {

     }
}
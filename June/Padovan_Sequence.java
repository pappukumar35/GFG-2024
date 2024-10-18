package June;

import java.util.*;

public class Padovan_Sequence {
     public int padovanSequence(int n) {
          // code here.
          if (n < 3) {
               return 1;
          }

          int a[] = new int[n + 1];
          a[0] = 1;
          a[1] = 1;
          a[2] = 1;

          for (int i = 3; i <= n; i++) {
               a[i] = (a[i - 2] % 1000000007 + a[i - 3] % 1000000007) % 1000000007;
          }
          return a[n] % 1000000007;

     }

     public static void main(String[] args) {

     }
}
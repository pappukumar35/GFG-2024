package June;

import java.util.*;
import java.util.*;

public class Prime_Pair_with_Target_Sum {
     public static ArrayList<Integer> getPrimes(int n) {
          ArrayList<Integer> ans = new ArrayList<Integer>();
          int a = -1, b = -1, i = 0;
          while (i <= n / 2) {
               a = isprime(i);
               i++;
               while (a == -1 && i <= n / 2) {
                    a = isprime(i);
                    i++;
               }
               b = isprime(n - a);
               if (a <= b && a + b == n) {
                    ans.add(a);
                    ans.add(b);
                    break;
               }
          }
          if (ans.size() == 0) {
               ans.add(-1);
               ans.add(-1);
          }
          return ans;
     }

     static int isprime(int n) {
          int cnt = 0;
          for (int i = 1; i <= Math.sqrt(n); i++) {
               if (n % i == 0) {
                    cnt = cnt + 1;
                    if (n / i != i) {
                         cnt = cnt + 1;
                    }
               }
          }
          if (cnt == 2) {
               return n;
          } else {
               return -1;
          }
     }

     public static void main(String[] args) {

     }
}
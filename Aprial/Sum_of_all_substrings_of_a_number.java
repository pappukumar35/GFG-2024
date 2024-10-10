import java.util.*;

public class Sum_of_all_substrings_of_a_number {
     static long mod = 10000_00007;

     public static long sumSubstrings(String s) {
          // Your code here
          int n = s.length();
          long prev = 0;
          long curr = 0;
          long sum = 0;
          for (int i = 0; i < n; i++) {
               long res = (long) (s.charAt(i) - '0');
               curr = (res * (i + 1) % mod + (prev * 10) % mod) % mod;
               sum = (sum + curr) % mod;
               prev = curr;
          }
          return sum;
     }

     public static void main(String[] args) {

     }
}
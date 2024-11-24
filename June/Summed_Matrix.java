package June;

import java.util.*;

public class Summed_Matrix {
     static long sumMatrix(long n, long q) {
          // code here
          if (q > 2 * n) { // invalid value of q
               return 0;
          }

          long count = 0;
          if (q <= n) {
               count = q - 1;
          } else {
               count = 2 * n - q + 1;
          }

          return count;
     }

     public static void main(String[] args) {

     }
}
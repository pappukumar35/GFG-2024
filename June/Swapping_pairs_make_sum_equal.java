package June;

import java.util.*;
import java.util.*;

public class Swapping_pairs_make_sum_equal {
     long findSwapValues(long a[], int n, long b[], int m) {
          long sumA = 0, sumB = 0;

          // Calculate the sum of elements in both arrays
          for (int i = 0; i < n; i++) {
               sumA += a[i];
          }
          for (int i = 0; i < m; i++) {
               sumB += b[i];
          }

          // If the difference is not even, we cannot find such a pair
          long diff = sumB - sumA;
          if (diff % 2 != 0) {
               return -1;
          }

          // The target value difference to balance the sums by swapping
          long target = diff / 2;

          // Use a set to store elements of array b
          HashSet<Long> setB = new HashSet<>();
          for (int i = 0; i < m; i++) {
               setB.add(b[i]);
          }

          // Check for each element in array a if there exists a corresponding element in
          // b
          for (int i = 0; i < n; i++) {
               long valA = a[i];
               long neededValB = valA + target;
               if (setB.contains(neededValB)) {
                    return 1;
               }
          }

          return -1;
     }

     public static void main(String[] args) {

     }
}
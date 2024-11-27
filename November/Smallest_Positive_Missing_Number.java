package November;

import java.util.HashSet;
import java.util.Set;

public class Smallest_Positive_Missing_Number {
     public int missingNumber(int[] arr) {
          Set<Integer> set = new HashSet<>();
          int n = arr.length;
          for (int val : arr) {
               if (val > 0) {
                    set.add(val);
               }
          }
          for (int i = 1; i <= n; i++) {
               if (!set.contains(i)) {
                    return i;
               }
          }
          return n + 1;
     }

     public static void main(String[] args) {

     }
}
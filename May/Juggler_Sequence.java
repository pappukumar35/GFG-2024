package May;

import java.util.*;
import java.util.*;

public class Juggler_Sequence {
     static List<Long> jugglerSequence(long n) {
          // code here
          List<Long> arr = new ArrayList<Long>();
          arr.add(n);
          while (n > 1) {
               if (n % 2 == 0) {
                    n = (long) Math.pow(n, (float) 1 / 2);
                    arr.add(n);
               } else {
                    n = (long) Math.pow(n, (float) 3 / 2);
                    arr.add(n);
               }
          }
          return arr;

     }

     public static void main(String[] args) {

     }
}
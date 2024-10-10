package July;

import java.util.*;

public class Smallest_number {
     public int sumOfDigits(int n) {
          int sum = 0;

          while (n > 0) {
               sum += n % 10;
               n = n / 10;
          }

          return sum;
     }

     public String smallestNumber(int s, int d) {
          if (s > 9 * d || s < 1) {
               return "-1";
          }

          int initialValue = 1 * (int) Math.pow(10, d - 1);
          while (initialValue < 1 * Math.pow(10, d)) {
               if (sumOfDigits(initialValue) == s) {
                    return Integer.toString(initialValue);
               }
               initialValue += 1;
          }

          return "-1";
     }

     public static void main(String[] args) {

     }
}
package June;

import java.util.*;

public class Count_numbers_containing {
     public static int countNumberswith4(int n) {
          int count = 0;
          for (int i = 1; i <= n; i++) {
               if (four(i))
                    count++;
          }
          return count;
     }

     static boolean four(int n) {
          while (n > 0) {
               int digit = n % 10;
               if (digit == 4)
                    return true;
               n = n / 10;
          }
          return false;
     }

     public static void main(String[] args) {

     }
}
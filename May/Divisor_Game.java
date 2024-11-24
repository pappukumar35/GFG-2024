package May;

import java.util.*;

public class Divisor_Game {
     public static boolean divisorGame(int n) {

          int count = 0;

          for (int i = 1; i < n; i++) {

               if (n % i == 0) {
                    count++;
               }

               n = n - i;
               i = 0;
          }

          if (count % 2 == 0)
               return false;

          else
               return true;
     }

     public static void main(String[] args) {

     }
}
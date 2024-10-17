package June;

import java.util.*;

public class Armstrong_Numbers {
     static String armstrongNumber(int n) {
          // code here
          int original = n;
          int sum = 0;
          while (n > 0) {
               int digit = n % 10;
               sum += digit * digit * digit;
               n /= 10;
          }
          if (sum == original) {
               return "true";
          } else {
               return "false";
          }
     }

     public static void main(String[] args) {

     }
}
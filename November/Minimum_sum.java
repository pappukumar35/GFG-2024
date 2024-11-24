package November;

import java.util.*;

public class Minimum_sum {
     String minSum(int[] arr) {
          Arrays.sort(arr);
          int n = arr.length;
          StringBuilder num1 = new StringBuilder();
          StringBuilder num2 = new StringBuilder();

          for (int i = 0; i < n; i++) {
               if (i % 2 == 0) {
                    num1.append(arr[i]);
               } else {
                    num2.append(arr[i]);
               }
          }

          String result = addStrings(num1.toString(), num2.toString());
          return result.replaceFirst("^0+(?!$)", "");
     }

     String addStrings(String num1, String num2) {
          StringBuilder result = new StringBuilder();
          int carry = 0, i = num1.length() - 1, j = num2.length() - 1;

          while (i >= 0 || j >= 0 || carry > 0) {
               int x = i >= 0 ? num1.charAt(i--) - '0' : 0;
               int y = j >= 0 ? num2.charAt(j--) - '0' : 0;
               int sum = x + y + carry;
               result.append(sum % 10);
               carry = sum / 10;
          }

          return result.reverse().toString();
     }

     public static void main(String[] args) {

     }
}
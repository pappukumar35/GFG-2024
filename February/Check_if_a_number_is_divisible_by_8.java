import java.io.*;
import java.nio.Buffer;
import java.util.*;

class Check_if_a_number_is_divisible_by_8 {
     class Solution {
          int DivisibleByEight(String s) {
               // code here
               int len = s.length();
               if (len <= 2) {
                    int x = Integer.parseInt(s);
                    return (x % 8 == 0) ? 1 : -1;
               }

               String st = s.substring(len - 3, len);
               int x = Integer.parseInt(st);

               if (x % 8 == 0)
                    return 1;

               return -1;
          }
     }

     public static void main(String[] args) {
          BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
          int t = Integer.parseInt(read.readLine());
          while (t-- > 0) {
               String S = read.readLine();
               Solution ob = new Solution();
               System.out.println(ob.DivisibleByEight(S));
          }
     }

}
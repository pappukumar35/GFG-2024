import java.util.*;

public class Rohan_Love_for_Matrix {
     static int firstElement(int n) {
          // code here
          int a = 1, b = 0;
          for (int i = 2; i <= n; i++) {
               int temp = a;
               a = (a + b) % 1000000007;
               b = temp;
          }
          return a % 1000000007;
     }

     public static void main(String[] args) {

     }

}
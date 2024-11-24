import java.util.*;

public class Gray_to_Binary_equivalent {
     public static int grayToBinary(int n) {
          int res = 0;

          while (n > 0) {
               res ^= n;
               n >>= 1;
          }

          return res;
     }

     public static void main(String[] args) {
          int number[] = { 4 };
          System.out.println(grayToBinary(0));

     }
}

import java.util.*;

class Maximum_Sum_Problem {
     public int maxSum(int n) {
          // code here.
          int sum = 0;
          if (n == 0)
               return 0;

          int s1 = maxSum(n / 2);
          int s2 = maxSum(n / 3);
          int s3 = maxSum(n / 4);

          sum = Math.max(n, s1 + s2 + s3);

          return sum;

     }

     public static void main(String[] args) {
          System.out.println();

     }
}
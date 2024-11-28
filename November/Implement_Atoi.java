package November;

public class Implement_Atoi {
     public int myAtoi(String s) {
          if (s == null || s.isEmpty()) {
               return 0;
          }

          s = s.trim();
          int n = s.length();
          long sum = 0;
          int b = 0;

          if (n == 0)
               return 0;

          if (s.charAt(0) == '-') {
               b = 1;
               s = s.substring(1);
          } else if (s.charAt(0) == '+') {
               s = s.substring(1);
          }

          s = s.replaceFirst("^0+", "");
          n = s.length();

          for (int i = 0; i < n; i++) {
               char c = s.charAt(i);
               if (c < '0' || c > '9')
                    break;
               int a = c - '0';
               sum = sum * 10 + a;

               if (sum >= Integer.MAX_VALUE && b == 0)
                    return Integer.MAX_VALUE;
               if (sum > Integer.MAX_VALUE && b == 1)
                    return Integer.MIN_VALUE;
          }

          return b == 1 ? -(int) sum : (int) sum;
     }

     public static void main(String[] args) {

     }
}
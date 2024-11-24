package october;

public class Nearest_multiple_of_10 {
     String roundToNearest(String str) {
          StringBuilder ans = new StringBuilder(str);
          int n = str.length();
          int t = (str.charAt(n - 1) - '0') % 10;
          if (t <= 5) {
               ans.setCharAt(n - 1, '0');
          } else {
               ans.setCharAt(n - 1, '0');
               for (int i = n - 2; i >= 0; i--) {
                    char ch = ans.charAt(i);
                    if (ch == '9') {
                         ans.setCharAt(i, '0');
                    } else {
                         ans.setCharAt(i, (char) (ch + 1));
                         break;
                    }
               }
          }
          return ans.toString();
     }

     public static void main(String[] args) {

     }
}
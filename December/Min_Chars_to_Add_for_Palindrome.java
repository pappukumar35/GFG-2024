package December;

public class Min_Chars_to_Add_for_Palindrome {
     public static int minChar(String A) {
          String rev = new StringBuilder(A).reverse().toString();
          String concat = A + "$" + rev;
          int[] lps = new int[concat.length()];
          int y = 0;
          for (int x = 1; x < concat.length(); x++) {
               while (y > 0 && concat.charAt(x) != concat.charAt(y)) {
                    y = lps[y - 1];
               }
               if (concat.charAt(x) == concat.charAt(y)) {
                    y++;
               }
               lps[x] = y;
          }
          return A.length() - lps[concat.length() - 1];
     }

     public static void main(String[] args) {

     }
}
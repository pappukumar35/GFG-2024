package December;

public class Strings_Rotations_of_Each {
     public static boolean areRotations(String s1, String s2) {
          // Your code here
          int n = s1.length();
          for (int i = 0; i < n; i++) {
               if (s1.charAt(0) == s2.charAt(i) && (i == 0 || s1.charAt(n - 1) == s2.charAt(i - 1))) {
                    if (checkRotation(i, s1, s2, n))
                         return true;
               }
          }
          return false;
     }

     private static boolean checkRotation(int i, String s1, String s2, int n) {
          for (int j = 0; j < n; j++) {
               if (s1.charAt(j) != s2.charAt(i % n))
                    return false;
               i++;
          }
          return true;
     }

     public static void main(String[] args) {

     }
}
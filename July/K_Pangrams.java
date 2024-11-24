package July;

import java.util.*;

public class K_Pangrams {
     boolean kPangram(String str, int k) {
          // Remove spaces using StringBuilder for efficiency
          StringBuilder sb = new StringBuilder();
          for (int i = 0; i < str.length(); i++) {
               char ch = str.charAt(i);
               if (ch != ' ') {
                    sb.append(ch);
               }
          }
          str = sb.toString();

          int n = str.length();
          if (n < 26)
               return false; // Not enough characters to form a pangram

          HashSet<Character> set = new HashSet<>();
          for (int i = 0; i < n; i++) {
               char ch = str.charAt(i);
               if (Character.isLowerCase(ch)) {
                    set.add(ch);
               }
          }

          int uniqueCharCount = set.size();
          int missingCharacters = 26 - uniqueCharCount;

          // Check if the number of missing characters is less than or equal to k
          return missingCharacters <= k;
     }

     public static void main(String[] args) {

     }

}

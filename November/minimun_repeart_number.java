package November;

public class minimun_repeart_number {

     static int minRepeats(String s1, String s2) {
          // code here
          for (char c : s2.toCharArray()) {
               if (!s1.contains(String.valueOf(c))) {
                    return -1;
               }
          }

          int count = 1;
          StringBuilder str = new StringBuilder(s1);

          // Repeat s1 until its length is at least the length of s2
          while (str.length() < s2.length()) {
               str.append(s1);
               count++;
          }

          // Check if s2 is now a substring
          if (str.toString().contains(s2)) {
               return count;
          }

          // Append one more time as a final check
          str.append(s1);
          count++;

          return str.toString().contains(s2) ? count : -1;
     }

     public static void main(String[] args) {

     }
}
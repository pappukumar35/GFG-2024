package Sepetember;

public class Smallest_window_in_a_string_containing_all_the_characters_of_another_string {
     public static String smallestWindow(String s, String p) {
          // Your code here
          int n1 = s.length(), n2 = p.length();
          int[] map1 = new int[26];
          int[] map2 = new int[26];

          for (int i = 0; i < n2; i++) {
               map1[p.charAt(i) - 'a']++;
          }

          int min = Integer.MAX_VALUE;
          String str = "";
          int i = 0;
          for (int j = 0; j < n1; j++) {
               map2[s.charAt(j) - 'a']++;
               while (i <= j && check(map1, map2)) {
                    if ((j - i) < min) {
                         min = j - i;
                         str = s.substring(i, j + 1);
                    }
                    map2[s.charAt(i) - 'a']--;
                    i++;
               }
          }
          return str.length() == 0 ? "-1" : str;
     }

     public static boolean check(int[] map1, int[] map2) {
          for (int i = 0; i < 26; i++) {
               if (map1[i] != 0 && map1[i] > map2[i])
                    return false;
          }
          return true;
     }

     public static void main(String[] args) {

     }
}
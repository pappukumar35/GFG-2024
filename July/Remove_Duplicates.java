package July;

import java.util.*;

public class Remove_Duplicates {
     String removeDups(String str) {
          // code here
          String ans = "";
          boolean visited[] = new boolean[26];
          int len = str.length();
          for (int i = 0; i < len; i++) {
               char ch = str.charAt(i);
               if (visited[ch - 'a'] == false) {
                    ans += ch;
                    visited[ch - 'a'] = true;
               }
          }
          return ans;
     }

     public static void main(String[] args) {

     }
}
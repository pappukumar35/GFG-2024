package July;

import java.util.*;

public class Longest_Common_Prefix_of_Strings {
     public String longestCommonPrefix(String arr[]) {
          String res = "";
          int len = arr.length;
          for (int i = 0; i < arr[0].length(); i++) {
               char tar = arr[0].charAt(i);
               if (check(arr, tar, i)) {
                    res += tar;
               } else
                    break;
          }
          return res.length() > 0 ? res : "-1";
     }

     public boolean check(String[] arr, char tar, int ind) {
          for (int i = 1; i < arr.length; i++) {
               if (ind >= arr[i].length() || arr[i].charAt(ind) != tar)
                    return false;
          }
          return true;
     }

     public static void main(String[] args) {

     }
}
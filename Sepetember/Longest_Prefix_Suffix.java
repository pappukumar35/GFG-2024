package Sepetember;

public class Longest_Prefix_Suffix {
     int lps(String str) {
          int n = str.length();
          int[] lps = new int[n]; // LPS array to store the longest prefix suffix values

          int len = 0; // length of the previous longest prefix suffix
          int i = 1;

          // The first character always has an LPS of 0, hence lps[0] = 0
          lps[0] = 0;

          // Loop through the string to fill the LPS array
          while (i < n) {
               if (str.charAt(i) == str.charAt(len)) {
                    len++;
                    lps[i] = len;
                    i++;
               } else {
                    // Mismatch after len matches
                    if (len != 0) {
                         len = lps[len - 1]; // Don't increment i here
                    } else {
                         lps[i] = 0;
                         i++;
                    }
               }
          }

          // Return the last value in the LPS array
          return lps[n - 1];
     }

     public static void main(String[] args) {

     }
}
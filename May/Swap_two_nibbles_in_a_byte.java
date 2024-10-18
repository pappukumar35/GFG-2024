package May;

import java.util.*;

public class Swap_two_nibbles_in_a_byte {
     static int swapNibbles(int n) {
          // code here
          int first = n % 16; // FIRST NIBBLE
          int second = n / 16; // SECOND NIBBLE
          return first * 16 + second; // COMBINING TWO NIBBLES
     }

     public static void main(String args[]) {

     }
}
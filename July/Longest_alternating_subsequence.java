package July;

import java.util.*;

public class Longest_alternating_subsequence {
     public int alternatingMaxLength(int[] arr) {
          // code here

          int increasing = 1;
          int decreasing = 1;

          for (int i = 1; i < arr.length; i++) {

               if (arr[i] > arr[i - 1]) {
                    increasing = decreasing + 1;
               } else if (arr[i] < arr[i - 1]) {
                    decreasing = increasing + 1;
               }
          }
          return Math.max(increasing, decreasing);

     }

     public static void main(String[] args) {

     }
}
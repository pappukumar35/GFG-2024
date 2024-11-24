package July;

import java.util.*;

public class Search_in_Rotated_Sorted_Array {
     int search(int[] arr, int key) {
          int n = arr.length;
          for (int i = 0; i < n; i++) {
               if (arr[i] == key) {
                    return i;
               }
          }
          return -1;
     }

     public static void main(String[] args) {

     }
}
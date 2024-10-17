package June;

import java.util.*;

public class Index_of_an_Extra_Element {
     public int findExtra(int n, int arr1[], int arr2[]) {
          // add code here.
          int i = 0, j = 0;
          while (i < arr1.length && j < arr2.length) {
               if (arr1[i] != arr2[j]) {
                    i++;
                    if (arr1[i] == arr2[j]) {
                         return i - 1;
                    }

               }
               i++;
               j++;

          }
          return arr1.length - 1;
     }

     public static void main(String[] args) {

     }
}
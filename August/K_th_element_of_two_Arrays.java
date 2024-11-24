package Auguest;

import java.util.*;

public class K_th_element_of_two_Arrays {
     public long kthElement(int k, int arr1[], int arr2[]) {
          // code here
          int l1 = arr1.length;
          int l2 = arr2.length;
          int l3 = l1 + l2;
          int arr3[] = new int[l3];

          System.arraycopy(arr1, 0, arr3, 0, l1);
          System.arraycopy(arr2, 0, arr3, l1, l2);
          Arrays.sort(arr3);
          return arr3[k - 1];
     }

     public static void main(String[] args) {

     }
}
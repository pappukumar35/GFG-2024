package December;

import java.util.*;

public class SortedArray {
     public int kthMissing(int[] arr, int k) {
          // code here
          int n = arr.length;
          int left = 0;
          int right = n - 1;
          while (left <= right) {
               int mid = left + (right - left) / 2;
               if (arr[mid] - (mid + 1) < k) {
                    left = mid + 1;
               } else {
                    right = mid - 1;
               }
          }
          return left + k;
     }

     public static void main(String args[]) {
          int[] arr = {};
     }
}
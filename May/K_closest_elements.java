package May;

import java.util.*;

public class K_closest_elements {
     int[] printKClosest(int[] arr, int n, int k, int x) {
          // code here
          int res[] = new int[k];
          int idx = 0, left = 0, right = n - 1, minDiff = Integer.MAX_VALUE;
          while (left <= right) {
               int mid = left + (right - left) / 2;
               int currDiff = Math.abs(x - arr[mid]);
               if (minDiff > currDiff || (minDiff == currDiff && arr[idx] < arr[mid])) {
                    minDiff = currDiff;
                    idx = mid;
               }
               if (arr[mid] > x) {
                    right = mid - 1;
               } else {
                    left = mid + 1;
               }
          }
          left = idx - 1;
          right = idx + 1;
          int i = 0;
          if (arr[idx] != x) {
               res[i++] = arr[idx];
          }
          while (i < k && left >= 0 && right < n) {
               if (Math.abs(arr[right] - x) <= Math.abs(arr[left] - x)) {
                    res[i++] = arr[right++];
               } else {
                    res[i++] = arr[left--];
               }
          }
          while (i < k && left < 0) {
               res[i++] = arr[right++];
          }
          while (i < k && right >= n) {
               res[i++] = arr[left--];
          }
          return res;
     }

     public static void main(String[] args) {

     }
}
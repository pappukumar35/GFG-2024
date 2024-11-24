package November;

import java.util.Arrays;

public class Nearly_sorted {
     public void nearlySorted(int[] arr, int k) {
          // code
          Arrays.sort(arr);

          int n = arr.length;
          for (int i = 0; i < n; i++) {
               if (arr[i] == k) {
                    Arrays.sort(arr);
               }
          }
     }

     public static void main(String[] args) {

     }
}
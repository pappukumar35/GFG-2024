package November;

import java.util.Arrays;

public class Next_Permutation {
     void nextPermutation(int[] arr) {
          int n = arr.length;
          int breakPoint = -1;
          for (int i = n - 2; i >= 0; i--) {
               if (arr[i] < arr[i + 1]) {
                    breakPoint = i;
                    break;
               }
          }
          if (breakPoint == -1) {
               Arrays.sort(arr);
               return;
          }
          for (int i = n - 1; i > breakPoint; i--) {
               if (arr[i] > arr[breakPoint]) {
                    int temp = arr[i];
                    arr[i] = arr[breakPoint];
                    arr[breakPoint] = temp;
                    break;
               }
          }
          Arrays.sort(arr, breakPoint + 1, n);

     }

     public static void main(String[] args) {

     }
}
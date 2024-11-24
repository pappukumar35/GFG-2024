package November;

import java.util.Arrays;

public class Make_array_elements_unique {
     public int minIncrements(int[] arr) {
          long count = 0;
          long N = arr.length;
          Arrays.sort(arr);

          for (int i = 1; i < N; i++) {
               if (arr[i] <= arr[i - 1]) { // here checking for uniqueness
                    int val = arr[i - 1] - arr[i] + 1; // putting item to make unique
                    count += val; // adding increments
                    arr[i] += val; // total sum
               }
          }

          return (int) count; // returning
     }

     public static void main(String[] args) {

     }
}
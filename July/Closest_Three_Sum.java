package July;

import java.util.*;

public class Closest_Three_Sum {
     static int threeSumClosest(int[] array, int target) {

          Arrays.sort(array);
          int min = Integer.MAX_VALUE;
          int correct = 0;
          for (int i = 0; i < array.length - 1; i++) {
               int j = i + 1;
               int k = array.length - 1;

               while (j < k) {
                    int sum = array[i] + array[j] + array[k];
                    int ans = Math.abs(sum - target);
                    if (sum == target) {
                         return sum;
                    }
                    if (sum < target) {
                         if (min > ans) {
                              min = ans;
                              correct = sum;
                         }
                    }
                    if (sum > target) {
                         if (min >= ans) {
                              min = ans;
                              correct = sum;
                         }
                    }

                    if (sum < target) {
                         j++;
                    } else {
                         k--;
                    }
               }
          }
          return correct;
     }

     public static void main(String args[]) {

     }
}
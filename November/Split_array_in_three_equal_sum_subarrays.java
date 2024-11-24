package November;

import java.util.ArrayList;

public class Split_array_in_three_equal_sum_subarrays {
     public List<Integer> findSplit(int[] arr) {
          // code here
          List<Integer> result = new ArrayList<>();

          // Step 1: Calculate total sum of the array
          int totalSum = 0;
          for (int num : arr) {
               totalSum += num;
          }

          // Step 2: Check if total sum is divisible by 3
          if (totalSum % 3 != 0) {
               result.add(-1);
               result.add(-1);
               return result;
          }

          int targetSum = totalSum / 3;
          int currentSum = 0;
          int count = 0;
          int i = -1, j = -1;

          // Step 3: Traverse the array to find i and j
          for (int k = 0; k < arr.length; k++) {
               currentSum += arr[k];

               // When we find a part that equals targetSum
               if (currentSum == targetSum) {
                    if (count == 0) {
                         i = k; // First part ends at i
                         count++;
                         currentSum = 0; // Reset for next segment
                    } else if (count == 1) {
                         j = k; // Second part ends at j
                         count++;
                         currentSum = 0; // Reset for next segment
                         break; // No need to continue further
                    }
               }
          }

          // If both i and j are valid and remaining part equals targetSum
          if (i != -1 && j != -1) {
               currentSum = 0;
               for (int k = j + 1; k < arr.length; k++) {
                    currentSum += arr[k];
               }
               if (currentSum == targetSum) {
                    result.add(i);
                    result.add(j);
                    return result;
               }
          }

          result.add(-1);
          result.add(-1);
          return result;
     }

     public static void main(String[] args) {

     }
}
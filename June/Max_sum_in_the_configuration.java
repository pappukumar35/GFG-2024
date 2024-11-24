package June;

import java.util.*;

public class Max_sum_in_the_configuration {
     long max_sum(int arr[], int n) {
          // Your code here

          long totalSum = 0; // Sum of all elements in the array
          long currentRotationSum = 0; // Initial index-based sum
          long maxSum = 0; // To store the maximum rotation sum

          // Calculate the total sum and initial rotation sum
          for (int i = 0; i < n; i++) {
               totalSum += (long) arr[i];
               currentRotationSum += (long) arr[i] * i;
          }

          maxSum = currentRotationSum; // Initialize maxSum with the initial rotation sum

          // Calculate the rotation sum for each rotation
          for (int i = 1; i < n; i++) {
               currentRotationSum = currentRotationSum - totalSum + (long) arr[i - 1] * n;
               maxSum = Math.max(currentRotationSum, maxSum);
          }

          return maxSum;

     }

     public static void main(String[] args) {

     }
}
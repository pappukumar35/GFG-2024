import java.io.*;
import java.util.*;

public class Strictly_Increasing_Array {
     public int min_operations(int[] nums) {
          int n = nums.length, maxi = 1;
          int dp[] = new int[n];

          for (int i = 0; i < n; i++)
               dp[i] = 1;

          for (int i = 1; i < n; i++) {
               for (int j = 0; j < i; j++) {
                    if (nums[i] > nums[j] && (nums[i] - nums[j] >= (i - j))) {
                         dp[i] = Math.max(1 + dp[j], dp[i]);
                         maxi = Math.max(maxi, dp[i]);
                    }
               }
          }

          return n - maxi;
     }

     public static void main(String[] args) {

     }
}

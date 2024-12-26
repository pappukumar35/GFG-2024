package December;

import java.util.*;

public class Two_Sum_Pair_with_Given_Sum {
     public boolean twoSum(int arr[], int target) {
          HashSet<Integer> set = new HashSet<>();
          int n = arr.length;
          int sum = 0;
          for (int i = 0; i < n; i++) {
               sum = target - arr[i];
               if (set.contains(sum)) {
                    return true;
               }
               set.add(arr[i]);
          }
          return false;
     }

     public static void main(String[] args) {

     }
}
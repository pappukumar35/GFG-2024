package May;

import java.util.*;
import java.util.*;

public class Combination_Sum {
     public void findCombination(int idx, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {
          if (target == 0) {
               ans.add(new ArrayList<>(ds));
               return;
          }
          for (int i = idx; i < arr.length; i++) {
               if (i > idx && arr[i] == arr[i - 1])
                    continue;
               if (arr[idx] > target)
                    break;

               ds.add(arr[i]);
               findCombination(i + 1, arr, target - arr[i], ans, ds);
               ds.remove(ds.size() - 1);
          }
     }

     public List<List<Integer>> CombinationSum2(int arr[], int n, int k) {
          // Code Here.
          List<List<Integer>> ans = new ArrayList<>();
          Arrays.sort(arr);
          findCombination(0, arr, k, ans, new ArrayList<>());
          return ans;
     }

     public static void main(String[] args) {

     }
}
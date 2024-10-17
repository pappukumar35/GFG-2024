package october;

import java.util.HashMap;

public class Subarray_range_with_given_sum {
     static int subArraySum(int arr[], int tar) {
          HashMap<Integer, Integer> map = new HashMap<>();
          map.put(0, 1);
          int sum = 0;
          int cnt = 0;
          int n = arr.length;
          for (int i = 0; i < n; i++) {
               sum += arr[i];
               int temp = sum - tar;
               if (map.containsKey(temp))
                    cnt += map.get(temp);
               map.put(sum, map.getOrDefault(sum, 0) + 1);

          }
          return cnt;
     }

     public static void main(String[] args) {

     }
}
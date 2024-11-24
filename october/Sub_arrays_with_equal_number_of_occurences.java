package october;

import java.util.HashMap;

public class Sub_arrays_with_equal_number_of_occurences {

     static int sameOccurrence(int arr[], int x, int y) {
          // write code here
          int n = arr.length;
          HashMap<Integer, Integer> map = new HashMap<>();

          for (int i = 0; i < n; i++) {
               if (arr[i] == x)
                    arr[i] = 1;
               else if (arr[i] == y)
                    arr[i] = -1;
               else
                    arr[i] = 0;
          }

          int ans = 0;
          int sum = 0;
          map.put(0, 1);
          for (int i = 0; i < n; i++) {
               sum += arr[i];

               if (!map.containsKey(sum)) {
                    map.put(sum, 1);
               } else {
                    ans += map.get(sum);
                    map.put(sum, map.get(sum) + 1);

               }
          }
          return ans;
     }

     public static void main(String[] args) {

     }
}
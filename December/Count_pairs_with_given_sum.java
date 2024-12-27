package December;

import java.util.*;

public class Count_pairs_with_given_sum {
     public int countPair(int[] arr, int target) {
          HashMap<Integer, Integer> map = new HashMap<>();
          int count = 0;
          for (int i = 0; i < arr.length; i++) {
               if (map.containsKey(target - i)) {
                    count += map.get(target - i);
               }
               map.put(i, map.getOrDefault(i, 0) + 1);
          }
          return count;
     }

     public static void main(String[] args) {

     }
}
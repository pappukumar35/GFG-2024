package october;

import java.util.HashMap;
import java.util.Map;

public class Single_Number {
     int getSingle(int arr[]) {
          HashMap<Integer, Integer> map = new HashMap<>();
          for (int a : arr) {
               map.put(a, map.getOrDefault(a, 0) + 1);
          }
          for (Map.Entry<Integer, Integer> set : map.entrySet()) {
               if (set.getValue() % 2 != 0) {
                    return set.getKey();
               }
          }
          return -1;
     }

     public static void main(String[] args) {

     }
}
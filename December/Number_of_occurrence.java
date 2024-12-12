package December;

import java.util.*;

public class Number_of_occurrence {
     int countFreq(int[] arr, int target) {
          int count = 0;
          HashMap<Integer, Integer> m = new HashMap<>();
          for (int num : arr) {
               m.put(num, m.getOrDefault(num, 0) + 1);
          }
          return m.getOrDefault(target, 0);
     }

     public static void main(String[] args) {

     }
}
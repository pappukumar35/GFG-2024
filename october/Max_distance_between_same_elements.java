package october;

import java.util.Hashtable;

public class Max_distance_between_same_elements {
     public int maxDistance(int[] arr) {
          Hashtable<Integer, Integer> firstOccurence = new Hashtable<>();
          int maxDifference = 0;

          for (int i = 0; i < arr.length; i++) {
               if (firstOccurence.containsKey(arr[i])) {
                    maxDifference = Math.max(maxDifference, i - firstOccurence.get(arr[i]));
               } else {
                    firstOccurence.put(arr[i], i);
               }
          }

          return maxDifference;
     }

     public static void main(String[] args) {

     }
}
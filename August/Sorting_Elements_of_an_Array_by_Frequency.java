package Auguest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Sorting_Elements_of_an_Array_by_Frequency {
     public ArrayList<Integer> sortByFreq(int arr[]) {
          // add your code here

          HashMap<Integer, Integer> hm = new HashMap<>();
          for (int i : arr) {
               hm.put(i, hm.getOrDefault(i, 0) + 1);
          }
          PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
               if (hm.get(a) == hm.get(b))
                    return a - b;
               return hm.get(b) - hm.get(a);
          });
          for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
               pq.add(entry.getKey());
          }
          ArrayList<Integer> ans = new ArrayList<>();
          while (!pq.isEmpty()) {
               int p = pq.poll();
               int n = hm.get(p);
               while (n-- > 0) {
                    ans.add(p);
               }
          }
          return ans;
     }

     public static void main(String[] args) {

     }
}
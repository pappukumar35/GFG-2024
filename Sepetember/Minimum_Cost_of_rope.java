package September;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Minimum_Cost_of_rope {
     public long minCost(long[] arr) {
          PriorityQueue<Long> pq = new PriorityQueue<>();
          ArrayList<Long> ls = new ArrayList<>();
          for (long a : arr) {
               pq.add(a);
          }

          while (pq.size() > 1) {
               long n = pq.poll() + pq.poll();

               ls.add(n);
               pq.add(n);
          }

          long ans = 0;

          for (int i = 0; i < ls.size(); i++) {
               ans += ls.get(i);
          }
          return ans;
     }

     public static void main(String[] args) {

     }
}
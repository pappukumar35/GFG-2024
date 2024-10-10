import java.util.Collections;
import java.util.PriorityQueue;

class Game_with_String {
     static int minValue(String s, int k) {

          PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
          int arr[] = new int[26];

          for (char c : s.toCharArray()) {
               arr[c - 'a']++;
          }

          for (int it : arr) {
               if (it > 0) {
                    pq.offer(it);
               }
          }

          while (k > 0) {
               int num = pq.poll();
               num -= 1;
               pq.offer(num);
               k--;
          }

          int ans = 0;
          for (int n : pq) {
               ans += (n * n);
          }

          return ans;
     }
}
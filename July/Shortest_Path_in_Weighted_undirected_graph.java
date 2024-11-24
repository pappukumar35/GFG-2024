package July;

import java.util.*;

public class Shortest_Path_in_Weighted_undirected_graph {
     public List<Integer> shortestPath(int n, int m, int edges[][]) {

          List<List<int[]>> ars = new ArrayList<>();
          for (int i = 0; i <= n; i++) {
               ars.add(new ArrayList<>());
          }

          for (int[] edge : edges) {
               int start = edge[0];
               int end = edge[1];
               int weight = edge[2];

               ars.get(start).add(new int[] { end, weight });
               ars.get(end).add(new int[] { start, weight });
          }

          PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> a[1] - b[1]);
          int[] dist = new int[n + 1];
          int[] prev = new int[n + 1];
          Arrays.fill(dist, Integer.MAX_VALUE);
          Arrays.fill(prev, -1);
          dist[1] = 0;

          q.offer(new int[] { 1, 0 });

          while (!q.isEmpty()) {

               int[] previous = q.poll();
               int prevstart = previous[0];
               int prevdist = previous[1];

               for (int[] current : ars.get(prevstart)) {
                    int end = current[0];
                    int currentweight = current[1];

                    if (dist[end] > prevdist + currentweight) {
                         dist[end] = prevdist + currentweight;
                         prev[end] = prevstart;
                         q.offer(new int[] { end, dist[end] });
                    }

               }
          }
          List<Integer> ans = new ArrayList<>();

          if (dist[n] == Integer.MAX_VALUE) {
               ans.add(-1);
               return ans;
          }

          for (int at = n; at != -1; at = prev[at]) {
               ans.add(at);
          }
          Collections.reverse(ans);
          ans.add(0, dist[n]);
          return ans;
     }

     public static void main(String[] args) {

     }
}
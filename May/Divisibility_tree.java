package May;

import java.util.*;
import java.util.*;

public class Divisibility_tree {
     private List<List<Integer>> adj;
     private boolean[] visited;
     private int[] componentSizes;
     private int ans;

     private void dfs(int node) {
          visited[node] = true;
          componentSizes[node] = 1;

          for (int neighbor : adj.get(node)) {
               if (!visited[neighbor]) {
                    dfs(neighbor);
                    componentSizes[node] += componentSizes[neighbor];

                    if (componentSizes[neighbor] % 2 == 0) {
                         ans++;
                    }
               }
          }
     }

     public int minimumEdgeRemove(int n, int[][] edges) {
          adj = new ArrayList<>();
          for (int i = 0; i <= n; i++) {
               adj.add(new ArrayList<>());
          }

          for (int[] edge : edges) {
               adj.get(edge[0]).add(edge[1]);
               adj.get(edge[1]).add(edge[0]);
          }

          visited = new boolean[n + 1];
          componentSizes = new int[n + 1];
          ans = 0;

          for (int i = 1; i <= n; i++) {
               if (!visited[i]) {
                    dfs(i);
               }
          }

          return ans;
     }

     public static void main(String[] args) {

     }
}
class Find_all_Critical_Connections_in_the_Graph {
     private int timer = 1;
     int vis[];
     int tin[];
     int low[];

     public ArrayList<ArrayList<Integer>> criticalConnections(int v, ArrayList<ArrayList<Integer>> adj) {
          ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
          vis = new int[v];
          tin = new int[v];
          low = new int[v];

          dfs(0, -1, adj, ans);

          ans.sort((a, b) -> {
               if (a.get(0).equals(b.get(0))) {
                    return a.get(1) - b.get(1);
               }
               return a.get(0) - b.get(0);
          });

          return ans;
     }

     void dfs(int node, int parent, ArrayList<ArrayList<Integer>> adj, ArrayList<ArrayList<Integer>> ans) {
          vis[node] = 1;
          low[node] = tin[node] = timer++;

          for (int it : adj.get(node)) {

               if (it == parent)
                    continue;
               if (vis[it] != 1) {
                    dfs(it, node, adj, ans);
                    low[node] = Math.min(low[node], low[it]);

                    // Bridge condition
                    if (low[it] > tin[node]) {
                         ArrayList<Integer> bridge = new ArrayList<>();
                         bridge.add(Math.min(it, node));
                         bridge.add(Math.max(it, node));
                         ans.add(bridge);
                    }
               } else {
                    low[node] = Math.min(low[node], low[it]);
               }
          }
     }
}
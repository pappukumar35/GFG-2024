class Course_Schedule{
    static int[] findOrder(int n, int m, ArrayList<ArrayList<Integer>> prerequisites) 
    {
        int[] inDegree = new int[n];
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        
        for (ArrayList<Integer> prerequisite : prerequisites) {
            int u = prerequisite.get(1);
            int v = prerequisite.get(0);
            
            inDegree[v]++;
            graph.get(u).add(v);
        }
        
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        int index = 0;
        while (!queue.isEmpty()) {
            int u = queue.poll();
            result.add(u);
            index++;
            
            for (int v : graph.get(u)) {
                inDegree[v]--;
                if (inDegree[v] == 0) {
                    queue.add(v);
                }
            }
        }
        
        if (index == n) {
            int[] order = new int[n];
            for (int i = 0; i < n; i++) {
                order[i] = result.get(i);
            }
            return order;
        } else {
            return new int[0];
        }
    }
}
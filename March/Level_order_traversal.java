class Level_order_traversal {
     static ArrayList<Integer> levelOrder(Node root) {
          Queue<Node> q = new LinkedList<>();
          ArrayList<Integer> ans = new ArrayList<>();
          q.add(root);

          while (!q.isEmpty()) {
               Node val = q.poll();
               ans.add(val.data);
               if (val.left != null) {
                    q.add(val.left);
               }
               if (val.right != null) {
                    q.add(val.right);
               }
          }
          return ans;
     }
}
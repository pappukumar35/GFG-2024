class Flatten_BST_to_sorted_list {
     public Node flattenBST(Node root) {
          if (root == null) {
               return root;
          }
          if (root.left == null && root.right == null) {
               return root;
          }
          ArrayList<Integer> list = new ArrayList<>();
          add(root, list);

          Node rot = new Node(list.get(0));
          Node curr = rot;

          for (int i = 1; i < list.size(); i++) {
               Node newN = new Node(list.get(i));
               curr.right = newN;
               curr = curr.right;
          }

          return rot;

     }

     public static void add(Node root, ArrayList<Integer> list) {
          if (root == null) {
               return;
          }
          add(root.left, list);
          list.add(root.data);
          add(root.right, list);
     }
}
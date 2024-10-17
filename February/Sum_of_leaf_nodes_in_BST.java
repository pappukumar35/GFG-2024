public class Sum_of_leaf_nodes_in_BST {
     public static int sumOfLeafNodes(Node root) {
          // code here
          if (root == null)
               return 0;
          if (root.left == null && root.right == null)
               return root.data;
          return sumOfLeafNodes(root.left) + sumOfLeafNodes(root.right);
     }

}

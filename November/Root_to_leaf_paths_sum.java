package November;

public class Root_to_leaf_paths_sum {
     static int totalCost = 0;

     public static void explorePaths(Node root, int currCost) {
          currCost = (currCost * 10) + root.data;
          if (root.right == null && root.left == null) {
               totalCost += currCost;
               return;
          }
          if (root.left != null)
               explorePaths(root.left, currCost);
          if (root.right != null)
               explorePaths(root.right, currCost);
     }

     public static int treePathsSum(Node root) {
          totalCost = 0;
          explorePaths(root, 0);
          return totalCost;
     }

     public static void main(String[] args) {

     }
}
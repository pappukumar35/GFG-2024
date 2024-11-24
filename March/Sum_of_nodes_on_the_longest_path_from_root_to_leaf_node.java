import java.util.*;

class Sum_of_nodes_on_the_longest_path_from_root_to_leaf_node {
     public int sumOfLongRootToLeafPath(Node root) {
          // code here
          int[] sol = new int[] { 0, 0 };
          solve(root, 0, 0, sol);
          return sol[1];
     }

     private void solve(Node root, int depth, int prevSum, int[] sol) {
          if (root == null) {
               if (depth > sol[0]) { // update depth and value both if path is longest
                    sol[1] = prevSum;
                    sol[0] = depth;
               } else if (depth == sol[0] && sol[1] < prevSum) {
                    // if leaf node is at same level, update only if current path sum
                    // is greater.
                    sol[1] = prevSum;
               }
               return;
          }

          int currSum = prevSum + root.data;
          solve(root.left, depth + 1, currSum, sol);
          solve(root.right, depth + 1, currSum, sol);
     }

     public static void main(String[] args) {

     }
}
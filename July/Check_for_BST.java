package July;

import java.util.*;

public class Check_for_BST {
     boolean isBST(Node root) {
          // code here.
          return isBSTUtil(root, null, null);
     }

     // Helper function
     private boolean isBSTUtil(Node root, Integer min, Integer max) {
          if (root == null) {
               return true;
          }

          if (min != null && root.data <= min || max != null && root.data >= max) {
               return false;
          }

          return isBSTUtil(root.left, min, root.data) && isBSTUtil(root.right, root.data, max);
     }

     public static void main(String[] args) {

     }
}
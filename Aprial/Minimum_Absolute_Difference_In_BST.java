import java.util.*;

class Minimum_Absolute_Difference_In_BST {
     int val = Integer.MAX_VALUE;
     Node prev = null;

     void find(Node root) {
          if (root == null)
               return;
          find(root.left);
          if (prev == null)
               prev = root;
          else {
               val = Math.min(val, root.data - prev.data);
               prev = root;
          }
          find(root.right);
     }

     int absolute_diff(Node root) {
          // Your code here
          find(root);
          return val;
     }

     public static void main(String[] args) {

     }
}
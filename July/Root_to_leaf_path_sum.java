package July;

import java.util.*;

public class Root_to_leaf_path_sum {
     static class Node {
          int data;
          Node next;
          Node right;
          Node left;

          Node(int data) {
               this.next = next;
               this.right = right;
               this.left = left;
          }
     }

     boolean hasPathSum(Node root, int target) {
          if (root == null) {
               return false;
          } else if (root.left == null && root.right == null && target - root.data == 0) {
               return true;
          }

          return hasPathSum(root.left, target - root.data) || hasPathSum(root.right, target - root.data);
     }

     public static void main(String[] args) {

     }
}
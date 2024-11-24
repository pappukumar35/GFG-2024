import java.util.*;

import org.w3c.dom.Node;

class Diagonal_sum_in_binary_tree {
     static class Node {
          int data;
          Node left, right;

          Node(int d) {
               data = d;
               left = right = null;
          }
     }

     public static ArrayList<Integer> diagonalSum(Node root) {
          // code here.
          ArrayList<Integer> arr = new ArrayList<Integer>();
          Queue<Node> q = new LinkedList<>();

          if (root == null)
               return arr;
          q.add(root);
          while (!q.isEmpty()) {
               int n = q.size();
               int sum = 0;
               for (int i = 0; i < n; i++) {
                    Node curr = q.remove();
                    while (curr != null) {
                         sum += (curr.data);
                         if (curr.left != null) {
                              q.add(curr.left);
                         }
                         curr = curr.right;

                    }

               }
               arr.add(sum);

          }
          return arr;
     }

     public static void main(String[] args) {

     }
}
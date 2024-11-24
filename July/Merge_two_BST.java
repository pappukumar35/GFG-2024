package July;

import java.util.*;

public class Merge_two_BST {

     class Node {
          int data;
          Node left, right;

          public Node(int d) {
               data = d;
               left = right = null;
          }
     }

     protected void inorder(Node root, Queue<Integer> q) {
          if (root == null) {
               return;
          }
          inorder(root.left, q);
          q.offer(root.data);
          inorder(root.right, q);
     }

     /*
      * problem function provided to us
      *
      */
     public List<Integer> merge(Node root1, Node root2) {
          // declaration section
          // q1 = queue to store the data for first BST
          // q2 = queue to store the data for second BST
          // res = resultant list
          Queue<Integer> q1 = new LinkedList<>();
          Queue<Integer> q2 = new LinkedList<>();
          List<Integer> res = new LinkedList<>();

          // filling the Q's with their respective values
          inorder(root1, q1);
          inorder(root2, q2);

          // here is the usage of sorted merging
          while (!q1.isEmpty() && !q2.isEmpty()) {
               if (q1.peek() < q2.peek())
                    res.add(q1.poll());
               else
                    res.add(q2.poll());
          }

          // adding the remaining elements
          res.addAll(q1);
          res.addAll(q2);

          return res;
     }

     public static void main(String arg[]) {

     }
}
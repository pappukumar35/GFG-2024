package July;

import java.util.*;

public class Populate_Inorder_Successor_for_all_nodes {
     static class Node {
          int data;
          Node next;
          Node right;
          Node left;

          Node(int data) {
               this.data = data;
               this.left = left;
               this.right = right;
               this.next = next;
          }
     }

     ArrayList<Node> inOrderAL = new ArrayList<>();
     int size = 0;

     public void populateNext(Node root) {
          inOrder(root);
     }

     public void inOrder(Node root) {
          if (root != null) {
               inOrder(root.left);
               inOrderAL.add(root);
               size += 1;
               if (size >= 2) {
                    inOrderAL.get(size - 2).next = root;
               }
               inOrder(root.right);
          }
     }

     public static void main(String[] args) {

     }
}
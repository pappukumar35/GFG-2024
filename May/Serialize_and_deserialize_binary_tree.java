package May;

import java.util.*;

public class Serialize_and_deserialize_binary_tree {
     static class Node {
          int data;

          Node(int adat) {
               this.data = data;
               this.next = next;
          }
     }

     public ArrayList<Integer> serialize(Node root) {
          // code here
          ArrayList<Integer> result = new ArrayList<>();
          serializeHelper(root, result);
          return result;

     }

     private ArrayList<Integer> serializeHelper(Node root, ArrayList<Integer> result) {
          if (root == null) {
               result.add(-1);
               return new ArrayList<Integer>(); // Return empty list
          }
          result.add(root.data);
          serializeHelper(root.left, result);
          serializeHelper(root.right, result);
          return result;
     }

     // Function to deserialize a list and construct the tree.
     public Node deSerialize(ArrayList<Integer> A) {
          // code here
          int[] index = { 0 };
          return deSerializeHelper(A, index);
     }

     private Node deSerializeHelper(ArrayList<Integer> A, int[] index) {
          if (index[0] >= A.size() || A.get(index[0]) == -1) {
               index[0]++;
               return null;
          }

          Node root = new Node(A.get(index[0]++));
          root.left = deSerializeHelper(A, index);
          root.right = deSerializeHelper(A, index);
          return root;
     }

     public static void main(String[] args) {

     }

}
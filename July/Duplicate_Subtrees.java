package July;

import java.util.*;

public class Duplicate_Subtrees {
     static class Node {
          int data;
          Node next;
          Node right;
          Node left;

          Node(int data) {
               this.data = data;
               this.next = next;
               this.left = left;
               this.right = right;
          }
     }

     public List<Node> printAllDups(Node root) {
          // code here
          List<Node> duplicates = new ArrayList<>();
          Map<String, Integer> map = new HashMap<>();
          serialize(root, map, duplicates);
          return duplicates;
     }

     private String serialize(Node node, Map<String, Integer> map, List<Node> duplicates) {
          if (node == null)
               return "#";

          String serial = node.data + "," + serialize(node.left, map, duplicates) + ","
                    + serialize(node.right, map, duplicates);
          map.put(serial, map.getOrDefault(serial, 0) + 1);
          if (map.get(serial) == 2) {
               duplicates.add(node);
          }
          return serial;
     }

     public static void main(String[] args) {

     }
}
package May;

import java.util.*;
import java.util.*;

public class Root_to_Leaf_Paths {
     static class Node {
          int data;
          Node left;
          Node right;

          Node(int data) {
               this.data = data;
               left = null;
               right = null;
          }
     }

     public static ArrayList<ArrayList<Integer>> Paths(Node root) {

          ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
          ArrayList<Integer> temp = new ArrayList<>();
          findPath(root, temp, arr);
          return arr;
     }

     private static void findPath(Node node, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> arr) {
          if (node == null)
               return;

          temp.add(node.data);
          if (node.left == null && node.right == null)
               arr.add(new ArrayList<>(temp));

          findPath(node.left, temp, arr);
          findPath(node.right, temp, arr);
          temp.remove(temp.size() - 1);
     }

     public static void main(String[] args) {

     }
}
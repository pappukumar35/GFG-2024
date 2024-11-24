package Auguest;

import java.util.*;

public class Sum_Tree {
     class Node {
          int data;
          Node left, right;

          Node(int item) {
               data = item;
               left = right = null;
          }
     }

     boolean isSumTree(Node root) {
          // Your code here
          if (root == null || (root.left == null && root.right == null))
               return true;
          int ls = findSum(root.left);
          int rs = findSum(root.right);
          if (ls + rs == root.data) {
               if (isSumTree(root.left) && isSumTree(root.right))
                    return true;
          }
          return false;
     }

     int findSum(Node root) {
          if (root == null)
               return 0;
          return root.data + findSum(root.left) + findSum(root.right);
     }

     public static void main(String[] args) {

     }

}
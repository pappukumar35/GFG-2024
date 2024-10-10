package July;

import java.util.*;

public class Vertical_Width_of_a_Binary_Tree {
     static class Node {
          int data;
          Node next;
          Node right;
          Node left;

          Node(int data) {
               this.data = data;
               this.right = right;
               this.left = left;
               this.next = next;
          }
     }

     void solve(Node root, int hd, int[] minMax) {
          if (root == null)
               return;
          minMax[0] = Math.min(minMax[0], hd);
          minMax[1] = Math.max(minMax[1], hd);
          solve(root.left, hd - 1, minMax);
          solve(root.right, hd + 1, minMax);
     }

     public int verticalWidth(Node root) {
          if (root == null)
               return 0;
          int[] minMax = { 0, 0 };
          solve(root, 0, minMax);
          return minMax[1] - minMax[0] + 1;
     }

     public static void main(String[] args) {

     }
}
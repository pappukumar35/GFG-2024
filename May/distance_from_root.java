package May;

import java.util.*;

public class distance_from_root {
     static class Node {
          int data;
          Node next;

          Node(int data) {
               this.data = data;
               this.next = next;
          }
     }

     ArrayList<Integer> Kdistance(Node root, int k) {
          ArrayList<Integer> list = new ArrayList<>();
          solution(root, list, k, 0);
          return list;
     }

     void solution(Node root, ArrayList<Integer> list, int k, int n) {
          if (root == null)
               return;
          if (k == n) {
               list.add(root.data);
               return;
          }
          solution(root.left, list, k, n + 1);
          solution(root.right, list, k, n + 1);
     }

     public static void main(String[] args) {

     }

}

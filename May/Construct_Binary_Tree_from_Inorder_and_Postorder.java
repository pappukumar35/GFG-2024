package May;

import java.util.*;

public class Construct_Binary_Tree_from_Inorder_and_Postorder {
     public static class Node {
          int data;
          Node next;

          Node(int data) {
               this.data = data;
               this.next = next;
          }

     }

     static Node right;
     static Node left;

     Node findtheNode(int[] in, int[] post, int start, int end, List<Integer> index) {
          if (index.get(0) == -1 || start > end)
               return null;
          int divfact = -1;
          for (int i = start; i <= end; i++) {
               if (post[index.get(0)] == in[i]) {
                    divfact = i;
                    break;
               }
          }
          int t = index.get(0);
          Node node = new Node(post[index.get(0)]);
          index.remove(0);
          index.add(t - 1);
          node.right = findtheNode(in, post, divfact + 1, end, index);
          node.left = findtheNode(in, post, start, divfact - 1, index);
          return node;
     }

     Node buildTree(int in[], int post[], int n) {
          List<Integer> index = new ArrayList<>();
          index.add(n - 1);
          return findtheNode(in, post, 0, n - 1, index);
     }

     public static void main(String[] args) {

     }
}
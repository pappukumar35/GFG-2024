package May;

import java.util.*;

public class Reverse_Level_Order_Traversal {
     static class Node {
          int data;
          Node next;

          Node(int data) {
               this.data = data;
               this.next = next;
          }
     }

     public ArrayList<Integer> reverseLevelOrder(Node root) {
          // code here
          ArrayList<Integer> ans = new ArrayList<>();
          Queue<Node> qu = new LinkedList<>();
          if (root != null)
               qu.add(root);
          while (qu.size() > 0) {
               Node temp = qu.peek();
               if (temp.right != null)
                    qu.add(temp.right);
               if (temp.left != null)
                    qu.add(temp.left);
               Node t = qu.remove();
               ans.add(t.data);
          }
          Collections.reverse(ans);
          return ans;
     }

     public static void main(String[] args) {

     }
}
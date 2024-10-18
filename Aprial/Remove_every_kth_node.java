import java.util.*;

import org.w3c.dom.Node;

public class Remove_every_kth_node {
     public static class Node {
          int data;
          Node next;

          Node next(int data) {
               this.data = data;
               this.next = next;
          }
     }

     Node delete(Node head, int k) {
          // Your code here
          Node temp = head;
          int i = 1;
          if (i == k) {
               return null;
          }
          while (temp != null && temp.next != null) {
               if (i + 1 == k) {
                    temp.next = temp.next.next;
                    i = 0;
               }
               i++;
               temp = temp.next;
          }
          return head;

     }

     public static void main(String[] args) {

     }
}
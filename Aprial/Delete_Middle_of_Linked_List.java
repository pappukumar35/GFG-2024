import java.util.*;

import org.w3c.dom.Node;

public class Delete_Middle_of_Linked_List {
     public static class Node {
          int data;
          Node next;

          Node(int data) {
               this.data = data;
               this.next = next;
          }
     }

     Node deleteMid(Node head) {
          // This is method only submission.
          // You only need to complete the method.
          if (head == null || head.next == null)
               return null;
          Node slow = head, fast = head, pre = new Node(-1);
          pre.next = head;
          while (fast != null && fast.next != null) {
               fast = fast.next.next;
               slow = slow.next;
               pre = pre.next;
          }
          pre.next = slow.next;
          return head;
     }

     public static void main(String[] args) {

     }
}
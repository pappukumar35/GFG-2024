import java.util.*;

public class Merge_Sort_on_Doubly_Linked_List {
     class Node {
          int data;
          Node next, prev;

          Node(int data) {
               this.data = data;
               next = prev = null;
          }
     }

     static Node sortDoubly(Node head) {
          // add your code here
          if (head == null || head.next == null) {
               return head;
          }
          Node mid = getMid(head);
          Node l1 = sortDoubly(head);
          Node l2 = sortDoubly(mid);
          return merge(l1, l2);
     }

     static Node getMid(Node head) {
          Node slow = head;
          Node fast = head.next;
          while (fast.next != null && fast.next.next != null) {
               slow = slow.next;
               fast = fast.next.next;
          }
          Node mid = slow.next;
          slow.next = null;
          mid.prev = null;
          return mid;
     }

     static Node merge(Node l1, Node l2) {
          if (l1 == null)
               return l2;
          if (l2 == null)
               return l1;
          Node head = new Node(-1);
          Node tail = head;
          while (l1 != null && l2 != null) {
               if (l1.data < l2.data) {
                    l1.prev = tail;
                    tail.next = l1;
                    l1 = l1.next;
                    tail = tail.next;
               } else {
                    l2.prev = tail;
                    tail.next = l2;
                    l2 = l2.next;
                    tail = tail.next;
               }
          }
          if (l1 != null) {
               l1.prev = tail;
               tail.next = l1;
          }
          if (l2 != null) {
               l2.prev = tail;
               tail.next = l2;
          }
          head = head.next;
          head.prev = null;
          return head;
     }

     public static void main(String[] args) {

     }
}
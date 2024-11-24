package July;

import java.util.*;

public class Remove_all_occurences_of_duplicates_in_a_linked_list {
     static class Node {
          int data;
          Node next;

          Node(int data) {
               this.next = next;
               this.data = data;
          }
     }

     public Node removeAllDuplicates(Node head) {
          // code here
          Node current = head;
          Node previous = head;
          if (head == null) {
               return null;
          }

          if (head.next == null) {
               return head;
          }

          while (current != null && current.next != null) {
               Node nextt = current.next;

               if (current.data != nextt.data) {
                    previous = current;
                    current = nextt;

               }

               else {
                    int value = current.data;
                    if (current == head) {
                         while (head != null && head.data == value) {
                              head = head.next;
                         }
                         previous = head;
                         current = head;
                    } else {
                         while (current != null && current.data == value) {
                              current = current.next;
                         }
                         previous.next = current;
                    }
               }
          }

          return head;
     }

     public static void main(String[] args) {

     }
}
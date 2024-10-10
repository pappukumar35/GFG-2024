package June;

import java.util.*;

public class Identical_Linked_Lists {
     static class Node {
          int data;
          Node next;

          Node(int data) {
               this.data = data;
               this.next = next;
          }

     }

     public boolean areIdentical(Node head1, Node head2) {
          // write your code here
          Node temp1 = head1;
          Node temp2 = head2;

          while (temp1 != null && temp2 != null) {
               if (temp1.data != temp2.data) {
                    return false;
               }
               temp1 = temp1.next;
               temp2 = temp2.next;
          }

          if (temp1 == null && temp2 == null) {
               return true;
          }

          return false;
     }

     public static void main(String[] args) {

     }
}
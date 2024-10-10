import java.util.*;

import org.w3c.dom.Node;

public class Add_two_numbers {
     public static class Node {
          int data;
          Node next;

          Node(int data) {
               this.data = data;
               this.next = next;
          }
     }

     static Node reverse(Node head) {
          Node curr = head;
          Node prev = null;
          Node n = null;
          while (curr != null) {
               n = curr.next;
               curr.next = prev;
               prev = curr;
               curr = n;
          }
          return prev;
     }

     static Node addTwoLists(Node num1, Node num2) {
          Node n1 = reverse(num1);
          Node n2 = reverse(num2);
          Node ans = new Node(-1);
          Node re = ans;
          int carry = 0;
          while (n1 != null || n2 != null) {
               int sum = carry;
               if (n1 != null) {
                    sum += n1.data;
                    n1 = n1.next;
               }
               if (n2 != null) {
                    sum += n2.data;
                    n2 = n2.next;
               }
               Node temp = new Node(sum % 10);
               ans.next = temp;
               ans = temp;
               carry = sum / 10;
          }
          if (carry != 0) {
               Node temp = new Node(carry);
               ans.next = temp;
               ans = temp;
          }
          Node a = reverse(re.next);
          while (a != null && a.data == 0) {
               a = a.next;
          }
          if (a == null)
               return new Node(0);
          return a;
     }

     public static void main(String[] args) {

     }

}
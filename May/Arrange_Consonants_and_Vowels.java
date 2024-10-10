package May;

import java.util.*;

import org.w3c.dom.Node;

public class Arrange_Consonants_and_Vowels {
     public static class Node {
          int data;
          Node next;

          Node(int data) {
               this.data = data;
               this.next = next;
          }
     }

     public Node arrangeCV(Node head) {
          // write code here and return the head of changed linked list
          Node ans = new Node('$');
          Node re = ans;
          Node prev = null;
          Node temp = head;
          while (temp != null) {
               if (temp.data == 'a' || temp.data == 'e' || temp.data == 'i' || temp.data == 'o'
                         || temp.data == 'u') {
                    ans.next = temp;
                    ans = ans.next;
                    if (prev == null) {
                         head = head.next;
                         temp = head;
                    } else {
                         prev.next = temp.next;
                         temp.next = null;
                         temp = prev.next;
                    }
               } else {
                    prev = temp;
                    temp = temp.next;
               }
          }
          ans.next = head;
          return re.next;
     }

     public static void main(String[] args) {

     }
}
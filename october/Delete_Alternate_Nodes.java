package october;

public class Delete_Alternate_Nodes {
     public class Node {
          int data;
          Node next;

          public Node(int data) {
               this.data = data;
               this.next = null;
          }
     }

     public void deleteAlt(Node head) {
          if (head == null || head.next == null) {
               return;
          }
          Node temp = head;
          while (temp != null && temp.next != null) {
               temp.next = temp.next.next;
               temp = temp.next;
          }
     }

     public static void main(String[] args) {

     }
}
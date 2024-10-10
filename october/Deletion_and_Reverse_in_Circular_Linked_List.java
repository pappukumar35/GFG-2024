package october;

public class Deletion_and_Reverse_in_Circular_Linked_List {
     Node reverse(Node head) {
          if (head == null || head.next == head)
               return head;

          Node prev = null;
          Node current = head;
          Node next;
          Node tail = head;

          do {
               next = current.next;
               current.next = prev;
               prev = current;
               current = next;
          } while (current != head);

          tail.next = prev;
          head.next = prev;

          return prev;
     }

     // Function to delete a node from the circular linked list
     Node deleteNode(Node head, int key) {
          Node temp = head;
          if (temp.data == key) {
               while (temp.next != head) {
                    temp = temp.next;
               }
               temp.next = temp.next.next;
               head = temp.next;

          } else {
               boolean fl = false;
               while (temp.next.data != key) {
                    temp = temp.next;
                    if (temp == head) {
                         fl = true;
                         break;
                    }
               }
               if (fl == false)
                    temp.next = temp.next.next;
          }

          return head;
     }

     public static void main(String[] args) {

     }
}
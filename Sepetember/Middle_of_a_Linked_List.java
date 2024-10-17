package September;

public class Middle_of_a_Linked_List {
     int getMiddle(Node head) {
          if (head == null) {
               return -1;
          }

          Node slow = head;
          Node fast = head;

          while (fast != null && fast.next != null) {
               slow = slow.next;
               fast = fast.next.next;
          }

          return slow.data;
     }

     public static void main(String[] args) {

     }
}
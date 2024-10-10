package Auguest;

public class Find_length_of_Loop {
     public int countNodesinLoop(Node head) {
          // Add your code here.
          if (head == null || head.next == null)
               return 0;

          Node slow = head;
          Node fast = head;

          while (fast != null && fast.next != null) {
               slow = slow.next;
               fast = fast.next.next;

               if (slow == fast) {
                    int loopSize = 1;
                    Node current = slow;
                    while (current.next != slow) {
                         current = current.next;
                         loopSize++;
                    }
                    return loopSize;
               }
          }

          return 0;
     }

     public static void main(String[] args) {

     }
}
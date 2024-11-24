package November;

public class Shaped_Linked_Lists {
     int intersectPoint(Node head1, Node head2) {
          // code here
          int size = 0, size1 = 0;
          int it = 0;
          Node tr1;
          Node tr2;
          tr1 = head1;
          tr2 = head2;
          while (tr1 != null) {
               size++;
               tr1 = tr1.next;
          }
          while (tr2 != null) {
               size1++;
               tr2 = tr2.next;
          }
          int diff = Math.abs(size - size1);
          if (size < size1) {
               while (it != diff) {
                    head2 = head2.next;
                    it++;
               }
          } else if (size > size1) {
               while (it != diff) {
                    head1 = head1.next;
                    it++;
               }
          }
          while (head1 != null && head2 != null) {
               if (head1 == head2) {
                    return head1.data;
               }
               head1 = head1.next;
               head2 = head2.next;
          }
          return -1;
     }

     public static void main(String[] args) {

     }
}
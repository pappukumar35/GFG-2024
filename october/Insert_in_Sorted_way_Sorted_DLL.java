package october;

public class Insert_in_Sorted_way_Sorted_DLL {
     public Node sortedInsert(Node head, int x) {
          Node insert = new Node(x);
          Node element = head;
          if (head == null || head.data >= x) {
               insert.next = head;
               head = insert;
               return head;
          }
          while (element.next != null && element.next.data < x) {
               element = element.next;
          }
          insert.next = element.next;
          element.next = insert;
          return head;
     }

     public static void main(String[] args) {

     }
}

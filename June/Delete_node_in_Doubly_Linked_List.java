package June;

public class Delete_node_in_Doubly_Linked_List {
     static class Node {
          int data;
          Node next;
          Node prev;

          Node(int x) {
               this.data = data;
               this.next = next;
               this.prev = prev;
          }

     }

     public Node deleteNode(Node head, int x) {
          if (x == 1) {
               return head.next;
          }
          Node temp = head;
          for (int i = 1; i < x - 1; i++) {
               temp = temp.next;
          }
          temp.next = temp.next.next;
          if (temp.next != null) {
               temp.next.prev = temp;
          }
          return head;
     }

     public static void main(String[] args) {

     }
}
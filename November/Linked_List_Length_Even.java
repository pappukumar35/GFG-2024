package November;

public class Linked_List_Length_Even {
     public static class Node {
          int root;
          Node left;
          Node next;
          Node right;

          Node(int root) {
               this.left = left;
               this.right = right;
          }
     }

     public boolean isLengthEven(Node head) {
          // code here
          if (head == null)
               return true;
          if (head.next == null)
               return false;
          while (head != null) {
               if (head.next == null)
                    return false;
               head = head.next.next;
          }
          return true;
     }

     public static void main(String[] args) {

     }
}
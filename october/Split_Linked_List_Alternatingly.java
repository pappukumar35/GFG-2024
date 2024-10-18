package october;

public class Split_Linked_List_Alternatingly {
     public static class Node {
          int data;
          Node next;
          Node left;
          Node right;

          Node(int data) {
               this.data = data;
               this.left = left;
               this.right = right;
          }
     }

     Node[] alternatingSplitList(Node head) {
          // code here
          Node temp1 = head;
          Node temp2 = head.next;

          Node[] n = new Node[2];

          n[0] = temp1;
          n[1] = temp2;

          while (temp2 != null && temp2.next != null) {
               temp1.next = temp2.next;
               temp1 = temp1.next;
               temp2.next = temp1.next;
               temp2 = temp2.next;
          }
          temp1.next = null;
          return n;
     }

     public static void main(String[] args) {

     }
}
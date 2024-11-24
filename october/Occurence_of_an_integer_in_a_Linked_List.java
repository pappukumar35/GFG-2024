package october;

public class Occurence_of_an_integer_in_a_Linked_List {
     public static class Node {
          int root;
          int data;
          Node next;
          Node left;
          Node right;

          Node(int root) {
               this.root = root;
               this.left = left;
               this.right = right;
               this.next = next;
          }
     }

     public static int count(Node head, int key) {
          // code here
          Node curr = head;
          int count = 0;
          while (curr != null) {
               if (curr.data == key) {
                    count++;
               }
               curr = curr.next;
          }
          return count;
     }

     public static void main(String[] args) {

     }
}
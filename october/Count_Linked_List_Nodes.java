package october;

public class Count_Linked_List_Nodes {
     public static class Node {
          int data;
          Node left;
          Node right;
          Node next;

          Node(int data) {
               this.data = data;
               this.left = left;
               this.right = right;
          }
     }

     public static int getCount(Node head) {
          Node current = head;
          int count = 0;
          while (current != null) {
               count++;
               current = current.next;
          }
          return count;
     }

     public static void main(String[] args) {
          Node head = new Node(10);
          Node second = new Node(20);
          Node third = new Node(30);
          Node fourth = new Node(40);

          head.next = second;
          second.next = third;
          third.next = fourth;
          int totalNode = getCount(head);
          System.out.println("total number of linked " + totalNode);

     }
}
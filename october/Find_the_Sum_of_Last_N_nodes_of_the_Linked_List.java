package october;

public class Find_the_Sum_of_Last_N_nodes_of_the_Linked_List {

     class Node {
          int data;
          Node next;

          public Node(int data) {
               this.data = data;
               this.next = null;
          }
     }

     public int sumOfLastN_Nodes(Node head, int n) {
          // write code here
          int c = 0;

          int result = 0;

          int l = 0;
          Node temp = head;
          while (temp != null) {
               l++;
               temp = temp.next;
          }

          Node temp2 = head;
          while (temp2 != null) {
               c++;
               if (l - n < c) {
                    result = result + temp2.data;
               }
               temp2 = temp2.next;
          }

          return result;
     }

     public static void main(String[] args) {

     }
}
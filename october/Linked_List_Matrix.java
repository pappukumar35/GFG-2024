package october;

public class Linked_List_Matrix {
     public static class Node {
          int data;
          Node right, down;

          Node(int data) {
               this.data = data;
               right = null;
               down = null;
          }
     }

     static Node construct(int arr[][]) {
          int n = arr.length;
          Node head = new Node(arr[0][0]);
          Node curr = head;
          Node temp = head;

          for (int i = 0; i < n; i++) {
               for (int j = 0; j < n; j++) {
                    if ((j + 1) < n) {
                         Node newNode = new Node(arr[i][j + 1]);
                         curr.right = newNode;
                    }
                    if ((i + 1) < n) {
                         Node newNode = new Node(arr[i + 1][j]);
                         curr.down = newNode;
                    }

                    curr = curr.right;
               }
               curr = temp.down;
               temp = curr;
          }

          return head;
     }

     public static void main(String[] args) {

     }
}

package September;

public class Binary_Tree_to_DLL {
     Node head = null;
     Node tail = null;

     public Node bToDLL(Node root) {
          // Your code here
          if (root == null)
               return null;
          bToDLL(root.left);
          Node new_node = new Node(root.data);
          if (head == null) {
               head = new_node;
               tail = new_node;
          } else {
               tail.right = new_node;
               new_node.left = tail;
               tail = new_node;
          }
          bToDLL(root.right);
          return head;
     }

     public static void main(String[] args) {

     }
}
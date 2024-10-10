import org.w3c.dom.Node;

class Delete_without_head_pointer {
     void deleteNode(Node dn) {
          if (dn == null || dn.next == null) {
               return;
          }
          while (dn.next.next != null) {
               dn.data = dn.next.data;
               dn = dn.next;
          }
          int lastNodeValue = dn.next.data;
          dn.next = null;
          dn.data = lastNodeValue;
     }

     public static void main(String[] args) {

     }
}
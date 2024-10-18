class Linked_List_that_is_Sorted_Alternatingly {
     public Node sort(Node head) {
          if (head == null || head.next == null)
               return head;

          // Initialize two separate lists for ascending and descending elements
          Node ascendingHead = null, descendingHead = null;
          Node ascendingTail = null, descendingTail = null;
          Node current = head;
          boolean isAscending = true;

          while (current != null) {
               Node next = current.next;
               current.next = null;

               if (isAscending) {
                    if (ascendingHead == null) {
                         ascendingHead = current;
                         ascendingTail = current;
                    } else {
                         ascendingTail.next = current;
                         ascendingTail = current;
                    }
               } else {
                    if (descendingHead == null) {
                         descendingHead = current;
                         descendingTail = current;
                    } else {
                         descendingTail.next = current;
                         descendingTail = current;
                    }
               }

               isAscending = !isAscending;
               current = next;
          }

          // Reverse the descending list
          descendingHead = reverse(descendingHead);

          // Merge the two sorted lists
          return merge(ascendingHead, descendingHead);
     }

     private Node reverse(Node head) {
          Node prev = null;
          Node current = head;

          while (current != null) {
               Node next = current.next;
               current.next = prev;
               prev = current;
               current = next;
          }

          return prev;
     }

     private Node merge(Node l1, Node l2) {
          Node dummy = new Node(0);
          Node current = dummy;

          while (l1 != null && l2 != null) {
               if (l1.data <= l2.data) {
                    current.next = l1;
                    l1 = l1.next;
               } else {
                    current.next = l2;
                    l2 = l2.next;
               }
               current = current.next;
          }

          if (l1 != null) {
               current.next = l1;
          }
          if (l2 != null) {
               current.next = l2;
          }

          return dummy.next;
     }

     public static void main(String[] args) {

     }
}
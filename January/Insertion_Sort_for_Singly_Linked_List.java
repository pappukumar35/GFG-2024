import org.w3c.dom.Node;

class Insertion_Sort_for_Singly_Linked_List {
    public static Node insertionSort(Node head) {
        // code here
        if (head == null || head.next == null)
            return head;
        Node st = head;
        Node temp = st.next;
        while (temp != null) {
            if (temp.data >= st.data) {
                st = temp;
                temp = temp.next;
            } else {
                st.next = temp.next;
                Node curr = head;
                Node prev = null;
                while (curr != st && curr.data <= temp.data) {
                    prev = curr;
                    curr = curr.next;
                }
                if (prev == null) {
                    temp.next = head;
                    head = temp;
                } else {
                    temp.next = curr;
                    prev.next = temp;
                }
            }
            temp = st.next;
        }
        return head;
    }

}
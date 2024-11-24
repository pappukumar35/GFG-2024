class Sorted_insert_for_circular_linked_list {
    public Node sortedInsert(Node head, int data) {
        // code here
        Node newnode = new Node(data);

        if (head == null) {
            head = newnode;
            head.next = head; // Make it circular
        } else if (data < head.data) {
            Node temp1 = head;
            while (temp1.next != head) {
                temp1 = temp1.next;
            }
            head = newnode;
            newnode.next = temp1.next;
            temp1.next = head;
        } else {
            Node temp = head;
            while (temp.next != head && data > temp.next.data) {
                temp = temp.next;
            }
            newnode.next = temp.next;
            temp.next = newnode;
        }
        return head;
    }
}
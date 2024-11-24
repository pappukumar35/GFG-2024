class Subtraction_in_Linked_List {
    private int length(Node head) {
        Node temp = head;
        int len = 0;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        return len;
    }

    private boolean isSwapForBigger(Node head1, Node head2) {
        int len1 = length(head1);
        int len2 = length(head2);
        if (len1 > len2)
            return false;
        if (len1 < len2)
            return true;
        while (head1 != null) {
            if (head1.data == head2.data) {
                head1 = head1.next;
                head2 = head2.next;
                continue;
            }
            return head1.data < head2.data;
        }
        return false;
    }

    private Node reverse(Node head) {
        Node pre = null;
        Node curr = head;
        if (curr == null)
            return null;
        Node nexty = head.next;
        while (nexty != null) {
            curr.next = pre;
            pre = curr;
            curr = nexty;
            nexty = nexty.next;
        }
        curr.next = pre;
        return curr;
    }

    public Node subLinkedList(Node head1, Node head2) {
        // ELEMENT ZEROS
        while (head1.next != null && head1.data == 0)
            head1 = head1.next;
        while (head2.next != null && head2.data == 0)
            head2 = head2.next;

        // FIND BIGGER
        if (isSwapForBigger(head1, head2)) {
            Node head = head1;
            head1 = head2;
            head2 = head;
        }

        head1 = reverse(head1);
        head2 = reverse(head2);

        Node head = new Node(-1);
        Node tail = head;

        Node temp1 = head1, temp2 = head2;
        int borrow = 0;

        while (temp1 != null && temp2 != null) {

            int data = temp1.data - borrow - temp2.data;
            if (data < 0) {
                data += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            Node curr = new Node(data);
            tail.next = curr;
            tail = curr;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        while (temp1 != null) {
            int data = temp1.data - borrow;
            if (data < 0) {
                data += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            Node curr = new Node(data);
            tail.next = curr;
            tail = curr;
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            int data = temp2.data - borrow;
            if (data < 0) {
                data += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            Node curr = new Node(data);
            tail.next = curr;
            tail = curr;
            temp2 = temp2.next;
        }
        head = head.next;
        head = reverse(head);

        // ELEMENT ZEROS
        while (head.next != null && head.data == 0)
            head = head.next;

        return head;
    }
}
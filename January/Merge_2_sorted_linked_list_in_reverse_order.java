class Merge_2_sorted_linked_list_in_reverse_order {
    Node reverese(Node head) {
        if (head == null || head.next == null)
            return head;
        Node rest = reverese(head.next);
        head.next.next = head;
        head.next = null;
        return rest;
    }

    Node mergeResult(Node node1, Node node2) {

        if (node1 == null && node2 == null)
            return node1;
        else if (node1 == null) {
            return reverese(node2);
        } else if (node2 == null) {
            return reverese(node1);
        } else {

            Node i = node1;
            Node j = node2;
            Node temp = null;
            Node head = null;

            if (i.data >= j.data) {
                temp = j;
                head = temp;
                j = j.next;
                temp.next = null;
            } else {
                temp = i;
                head = temp;
                i = i.next;
                temp.next = null;
            }

            while (i != null && j != null) {
                if (i.data >= j.data) {
                    temp.next = j;
                    temp = temp.next;
                    j = j.next;
                    temp.next = null;
                } else {
                    temp.next = i;
                    temp = temp.next;
                    i = i.next;
                    temp.next = null;
                }
            }

            while (i != null) {
                temp.next = i;
                temp = temp.next;
                i = i.next;
            }

            while (j != null) {
                temp.next = j;
                temp = temp.next;
                j = j.next;
            }
            return reverese(head);
        }
    }
}
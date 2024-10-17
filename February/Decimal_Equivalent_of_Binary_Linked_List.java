class Decimal_Equivalent_of_Binary_Linked_List {
    long DecimalValue(Node head) {
        head = reverse(head);
        long mod = (long) 1e9 + 7;
        long pwr = 1, res = 0;
        Node temp = head;
        while (temp != null) {
            res = (res + (temp.data * pwr) % mod) % mod;
            pwr = (pwr * 2) % mod;
            temp = temp.next;
        }
        return res;
    }

    Node reverse(Node head) {
        Node curr = head, prev = null, next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
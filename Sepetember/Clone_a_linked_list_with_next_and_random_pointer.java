package Sepetember;

import java.util.HashMap;

public class Clone_a_linked_list_with_next_and_random_pointer {
     class Node {
          int data;
          Node next, random;

          Node(int d) {
               data = d;
               next = random = null;

          }
     }

     Node copyList(Node head) {
          // Step 1: Create a hashmap to store the nodes
          HashMap<Node, Node> map = new HashMap<>();

          // Step 2: Traverse the original list and create a copy of each node
          Node temp = head;
          while (temp != null) {
               map.put(temp, new Node(temp.data));
               temp = temp.next;
          }

          // Step 3: Traverse the original list again and set next and random pointers
          temp = head;
          while (temp != null) {
               map.get(temp).next = map.get(temp.next);
               map.get(temp).random = map.get(temp.random);
               temp = temp.next;
          }

          // Step 4: Return the head of the copied list
          return map.get(head);
     }

     public static void main(String[] args) {

     }
}
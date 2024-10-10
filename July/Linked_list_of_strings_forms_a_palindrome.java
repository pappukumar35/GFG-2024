package July;

import java.util.*;

public class Linked_list_of_strings_forms_a_palindrome {
     static class Node {
          int data;
          Node next;

          Node(int data) {
               this.next = next;
               this.data = data;
          }
     }

     public boolean compute(Node root) {
          StringBuilder store = new StringBuilder();

          while (root != null) {
               store.append(root.data);
               root = root.next;
          }

          for (int i = 0; i < store.length() / 2; i++) {
               if (store.charAt(i) != store.charAt(store.length() - i - 1))
                    return false;
          }
          return true;
     }

     public static void main(String[] args) {

     }
}
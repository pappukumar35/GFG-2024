package october;

import java.util.ArrayList;

public class XOR_Linked_List {
     public static class List {
          int val;
          List data;
          List next;

          List(int val) {
               this.val = val;
               this.next = null;

          }
     }

     static Node insert(Node head, int data) {
          Node newNode = new Node(data);
          newNode.npx = head;
          return newNode;
     }

     static ArrayList<Integer> getList(Node head) {
          ArrayList<Integer> res = new ArrayList<>();
          while (head != null) {
               res.add(head.data);
               head = head.npx;
          }
          return res;
     }

     public static void main(String[] args) {

     }
}
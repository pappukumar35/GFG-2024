package Sepetember;

public class Palindrome_Linked_List {
     public static class Node {
          int va;
          Node next;
          Node data;
     }

     boolean isPalindrome(Node head) {
          // Your code here
          if (head == null || head.next == null) {
               return true;
          }

          Node slow = head;
          Node fast = head;
          while (fast != null && fast.next != null) {
               slow = slow.next;
               fast = fast.next.next;
          }

          Node curr = slow;
          Node prev = null;
          Node next;

          while (curr != null) {
               next = curr.next;
               curr.next = prev;
               prev = curr;
               curr = next;
          }

          Node right = prev;
          Node left = head;
          while (right != null) {
               if (right.data != left.data) {
                    return false;
               }
               left = left.next;
               right = right.next;
          }
          return true;
     }

     public static void main(String[] args) {

     }
}
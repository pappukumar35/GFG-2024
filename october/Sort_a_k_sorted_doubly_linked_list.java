package october;

import java.util.PriorityQueue;

public class Sort_a_k_sorted_doubly_linked_list {
     public static class DLLNode {
          int data;
          DLLNode next;
          DLLNode left;
          DLLNode right;
          DLLNode prev;

          DLLNode(int data) {
               this.data = data;
               this.left = left;
               this.right = right;
               this.prev = prev;
          }
     }

     public DLLNode sortAKSortedDLL(DLLNode head, int k) {
          if (head == null) {
               return head;
          }

          // Create a Min Heap (PriorityQueue) for storing the k+1 elements
          PriorityQueue<DLLNode> minHeap = new PriorityQueue<>((a, b) -> a.data - b.data);

          DLLNode newHead = null, last = null;

          // Add the first k+1 elements to the Min Heap
          DLLNode node = head;
          for (int i = 0; node != null && i <= k; i++) {
               minHeap.add(node);
               node = node.next;
          }

          // Extract the smallest and adjust pointers
          while (!minHeap.isEmpty()) {
               // Get the minimum element from the heap
               DLLNode minNode = minHeap.poll();

               // If this is the first element, set it as the new head
               if (newHead == null) {
                    newHead = minNode;
                    newHead.prev = null;
                    last = newHead;
               } else {
                    // Adjust the pointers
                    last.next = minNode;
                    minNode.prev = last;
                    last = minNode;
               }

               // Add the next element from the unsorted list to the heap
               if (node != null) {
                    minHeap.add(node);
                    node = node.next;
               }
          }

          // Mark the end of the sorted list
          last.next = null;
          return newHead;
     }

     public static void main(String[] args) {

     }
}

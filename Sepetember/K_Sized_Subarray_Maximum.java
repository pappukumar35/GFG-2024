package Sepetember;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class K_Sized_Subarray_Maximum {
     public ArrayList<Integer> max_of_subarrays(int k, int arr[]) {
          ArrayList<Integer> result = new ArrayList<>();
          Deque<Integer> deque = new LinkedList<>();

          for (int i = 0; i < k; i++) {
               while (!deque.isEmpty() && arr[i] >= arr[deque.peekLast()]) {
                    deque.removeLast();
               }
               deque.addLast(i);
          }

          for (int i = k; i < arr.length; i++) {
               result.add(arr[deque.peek()]);

               while (!deque.isEmpty() && deque.peek() <= i - k) {
                    deque.removeFirst();
               }

               while (!deque.isEmpty() && arr[i] >= arr[deque.peekLast()]) {
                    deque.removeLast();
               }

               deque.addLast(i);
          }

          result.add(arr[deque.peek()]);

          return result;
     }

     public static void main(String[] args) {

     }
}
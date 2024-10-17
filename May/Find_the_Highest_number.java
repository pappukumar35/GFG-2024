package May;

import java.util.*;
import java.util.*;

public class Find_the_Highest_number {
     public int findPeakElement(List<Integer> a) {
          // Initialize two pointers: 'left' starting at the beginning of the array
          // and 'right' starting at the end of the array.
          int left = 0;
          int right = a.size() - 1;

          // Perform a binary search.
          while (left < right) {
               // Find the middle index to divide the array into two halves.
               int mid = left + (right - left) / 2;

               // Compare the middle element with its next element to decide which half to
               // keep.
               // If the middle element is greater than the next element, the peak is in the
               // left half (including mid).
               if (a.get(mid) > a.get(mid + 1)) {
                    right = mid; // Move the 'right' pointer to 'mid'.
               } else {
                    // If the middle element is less than the next element, the peak is in the right
                    // half.
                    left = mid + 1; // Move the 'left' pointer to 'mid + 1'.
               }
          }

          // When the pointers converge, 'left' will be pointing to the peak element.
          return a.get(left);
     }

     public static void main(String[] args) {

     }
}
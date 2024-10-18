package September;

import java.util.ArrayList;

public class Alternate_positive_and_negative_numbers {
     public void rearrange(ArrayList<Integer> arr) {
          // Create two separate lists to store positive and negative numbers
          ArrayList<Integer> pos = new ArrayList<>();
          ArrayList<Integer> neg = new ArrayList<>();

          // Loop through the array to separate positive and negative numbers
          for (int i = 0; i < arr.size(); i++) {
               if (arr.get(i) >= 0) {
                    pos.add(arr.get(i)); // Add positive numbers to 'pos'
               } else {
                    neg.add(arr.get(i)); // Add negative numbers to 'neg'
               }
          }

          int n = pos.size(); // Size of positive list
          int m = neg.size(); // Size of negative list

          // Initialize indices for positive and negative lists
          int n1 = 0, m1 = 0, i = 0;

          // Loop through the array and alternately add positive and negative numbers
          while (n1 < n && m1 < m) {
               if (i % 2 == 0) {
                    arr.set(i, pos.get(n1)); // Add a positive number
                    n1++;
               } else {
                    arr.set(i, neg.get(m1)); // Add a negative number
                    m1++;
               }
               i++;
          }

          // If there are remaining positive numbers, add them
          while (n1 < n) {
               arr.set(i, pos.get(n1));
               n1++;
               i++;
          }

          // If there are remaining negative numbers, add them
          while (m1 < m) {
               arr.set(i, neg.get(m1));
               m1++;
               i++;
          }
     }

     public static void main(String[] args) {

     }
}
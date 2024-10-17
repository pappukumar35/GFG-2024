package May;

import java.util.*;

public class Vertical_sum {
     static class Node {
          int data;
          Node next;

          Node(int data) {
               this.data = data;
               this.next = next;
          }
     }

     public void helper(Node root, HashMap<Integer, Integer> hm, int dist) {
          if (root == null) {
               return;
          }

          // Update the sum for the current distance
          hm.put(dist, hm.getOrDefault(dist, 0) + root.data);

          // Traverse left and right subtrees
          helper(root.left, hm, dist - 1);
          helper(root.right, hm, dist + 1);
     }

     public ArrayList<Integer> verticalSum(Node root) {
          ArrayList<Integer> result = new ArrayList<>();
          if (root == null) {
               return result;
          }

          HashMap<Integer, Integer> hm = new HashMap<>();
          // Populate the hashmap with vertical sums
          helper(root, hm, 0);

          // Extract the sums from the hashmap and store in result
          // Keys in hashmap are the distances from root
          // We iterate over these distances from min to max to ensure left to right order
          int minDist = Collections.min(hm.keySet());
          int maxDist = Collections.max(hm.keySet());
          for (int i = minDist; i <= maxDist; i++) {
               result.add(hm.get(i));
          }

          return result;
     }

     public static void main(String[] args) {

     }
}
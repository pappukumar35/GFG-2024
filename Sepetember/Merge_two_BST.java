package Sepetember;

import java.util.ArrayList;
import java.util.List;

public class Merge_two_BST {
     public List<Integer> merge(Node root1, Node root2) {
          // List to store in-order traversal of first BST
          List<Integer> list1 = new ArrayList<>();
          inOrderTraversal(root1, list1);

          // List to store in-order traversal of second BST
          List<Integer> list2 = new ArrayList<>();
          inOrderTraversal(root2, list2);

          // Merge the two sorted lists
          return mergeSortedLists(list1, list2);
     }

     // Helper function to perform in-order traversal of a BST
     private void inOrderTraversal(Node root, List<Integer> list) {
          if (root == null)
               return;
          inOrderTraversal(root.left, list);
          list.add(root.data);
          inOrderTraversal(root.right, list);
     }

     // Helper function to merge two sorted lists
     private List<Integer> mergeSortedLists(List<Integer> list1, List<Integer> list2) {
          List<Integer> merged = new ArrayList<>();
          int i = 0, j = 0;
          int size1 = list1.size();
          int size2 = list2.size();

          // Merge the two lists
          while (i < size1 && j < size2) {
               if (list1.get(i) < list2.get(j)) {
                    merged.add(list1.get(i));
                    i++;
               } else {
                    merged.add(list2.get(j));
                    j++;
               }
          }

          // Add remaining elements from list1, if any
          while (i < size1) {
               merged.add(list1.get(i));
               i++;
          }

          // Add remaining elements from list2, if any
          while (j < size2) {
               merged.add(list2.get(j));
               j++;
          }

          return merged;
     }

     public static void main(String[] args) {

     }
}
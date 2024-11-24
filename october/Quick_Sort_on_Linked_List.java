package october;

import java.util.ArrayList;
import java.util.Collections;

public class Quick_Sort_on_Linked_List {
     public static Node quickSort(Node node) {
          ArrayList<Integer> arr = new ArrayList<>();
          Node temp = node;
          while (temp != null) {
               arr.add(temp.data);
               temp = temp.next;
          }
          ArrayList<Integer> ans = quickSort(arr);
          Node dummy = new Node(-1);
          Node tail = dummy;
          for (int i : ans) {
               tail.next = new Node(i);
               tail = tail.next;
          }
          return dummy.next;

     }

     public static ArrayList<Integer> quickSort(ArrayList<Integer> list) {
          if (list.size() <= 1) {
               return list;
          }

          ArrayList<Integer> sortedList = new ArrayList<>(list);
          quickSortHelper(sortedList, 0, sortedList.size() - 1);
          return sortedList;
     }

     private static void quickSortHelper(ArrayList<Integer> list, int low, int high) {
          if (low < high) {
               int pivotIndex = partition(list, low, high);
               quickSortHelper(list, low, pivotIndex - 1);
               quickSortHelper(list, pivotIndex + 1, high);
          }
     }

     private static int partition(ArrayList<Integer> list, int low, int high) {
          int pivot = list.get(high);
          int i = low - 1;

          for (int j = low; j < high; j++) {
               if (list.get(j) <= pivot) {
                    i++;
                    Collections.swap(list, i, j);
               }
          }

          Collections.swap(list, i + 1, high);
          return i + 1;
     }

     public static void main(String[] args) {

     }
}
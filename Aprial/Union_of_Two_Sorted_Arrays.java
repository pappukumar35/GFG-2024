import java.util.*;
import java.util.*;

public class Union_of_Two_Sorted_Arrays {
     public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
          // add your code here
          ArrayList<Integer> unionArray = new ArrayList<>();
          Set<Integer> uniqueElements = new HashSet<>();
          for (int i : arr1) {
               uniqueElements.add(i);
          }
          for (int j : arr2) {
               uniqueElements.add(j);
          }

          unionArray.addAll(uniqueElements);
          Collections.sort(unionArray);

          return unionArray;
     }

     public static void main(String[] args) {

     }
}
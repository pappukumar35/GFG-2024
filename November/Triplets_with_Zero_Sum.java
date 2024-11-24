
package November;

import java.util.ArrayList;

public class Triplets_with_Zero_Sum {
     public List<List<Integer>> findTriplets(int[] arr) {

          // Your code here

          List<List<Integer>> li = new ArrayList<>();

          List<Integer> temp = new ArrayList<>();

          int k = 0;

          int j = 0;

          int size = 0;

          int i = 0;

          boolean isin = false;

          for (i = 0; i < arr.length; i++) {

               for (j = i + 1; j < arr.length; j++) {

                    for (k = j + 1; k < arr.length; k++) {

                         if (arr[i] + arr[j] + arr[k] == 0) {

                              temp.add(i);

                              temp.add(j);

                              temp.add(k);

                              li.add(size, temp);

                              size++;

                              temp = new ArrayList<>();

                         }

                    }

               }

          }

          return li;

     }

     public static void main(String[] args) {

     }
}
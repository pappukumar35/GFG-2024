package october;

import java.util.ArrayList;
import java.util.Arrays;

public class Alternative_Sorting {
     public static ArrayList<Integer> alternateSort(int[] arr) {
          ArrayList<Integer> res = new ArrayList<>();
          Arrays.sort(arr);
          int i = 0;
          int j = arr.length - 1;
          while (i < j) {
               res.add(arr[j--]);
               res.add(arr[i++]);
          }
          if (i == j) {
               res.add(arr[i]);
          }
          return res;
     }

     public static void main(String[] args) {

     }
}
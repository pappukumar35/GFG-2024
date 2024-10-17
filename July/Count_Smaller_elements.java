package July;

import java.util.*;
import java.util.*;

public class Count_Smaller_elements {
     public int binarySearch(List<Integer> v, int x) {
          int l = 0, h = v.size() - 1, mid;
          while (l <= h) {
               mid = (l + h) / 2;
               if (v.get(mid) == x)
                    return mid;
               else if (v.get(mid) > x)
                    h = mid - 1;
               else
                    l = mid + 1;
          }
          return -1;
     }

     public int[] constructLowerArray(int[] arr) {
          List<Integer> v = new ArrayList<>();
          for (int num : arr) {
               v.add(num);
          }
          Collections.sort(v);

          int[] t = new int[arr.length];
          for (int i = 0; i < arr.length; i++) {
               int max = binarySearch(v, arr[i]);
               while (max > 0 && v.get(max - 1).equals(v.get(max))) {
                    max--;
               }
               t[i] = max;
               v.remove(max);
          }
          return t;
     }

     public static void main(String[] args) {

     }
}
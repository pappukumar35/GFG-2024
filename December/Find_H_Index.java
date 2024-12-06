package December;

import java.util.*;

public class Find_H_Index {
     public int hIndex(int[] citations) {
          int n = citations.length;
          int max = 0;
          Arrays.sort(citations);
          for (int i = n - 1; i >= 0; i--) {
               if (n - 1 <= citations[i])
                    max = Math.max(max, n - 1);
          }
          return max;
     }

     public static void main(String[] args) {

     }
}
package July;

import java.util.*;

public class Row_with_max_1s {
     public int rowWithMax1s(int arr[][]) {
          int m = arr.length;
          int n = arr[0].length;
          int maxOnes = 0;
          int maxOnesRow = -1;

          for (int i = 0; i < m; i++) {
               int oneCount = 0;
               for (int j = 0; j < n; j++) {
                    oneCount += arr[i][j];
               }
               if (oneCount > maxOnes) {
                    maxOnes = oneCount;
                    maxOnesRow = i;
               }
          }
          return maxOnesRow;
     }

     public static void main(String[] args) {

     }
}
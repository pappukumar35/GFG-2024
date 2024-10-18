package June;

import java.util.*;

public class Maximum_occured_integer {
     public static int maxOccured(int n, int l[], int r[], int maxx) {
          int arr[] = new int[maxx + 2];
          for (int i = 0; i < n; i++) {
               arr[l[i]] = arr[l[i]] + 1;
               arr[r[i] + 1] = arr[r[i] + 1] - 1;
          }

          for (int i = 1; i < arr.length; i++) {
               arr[i] = arr[i] + arr[i - 1];
          }

          int ans = 1;
          int fre = arr[1];

          for (int i = 0; i < arr.length; i++) {
               if (fre < arr[i]) {
                    fre = arr[i];
                    ans = i;
               }
          }

          return ans;
     }

     public static void main(String[] args) {

     }
}
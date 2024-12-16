package December;

import java.util.Arrays;

public class element_of_two_Arrays {
     public int kthElement(int a[], int b[], int k) {
          int i = a.length - 1;
          int j = 0;
          while (i >= 0) {
               if (a[i] > b[j]) {
                    swap(i, j, a, b);
                    i--;
                    j++;
               } else {
                    break;
               }
          }
          Arrays.sort(a);
          Arrays.sort(b);
          if ((k - 1) <= a.length - 1) {
               return search(0, a.length - 1, a, k - 1);
          }
          return search(0, b.length - 1, b, (k - 1) - (a.length));
     }

     void swap(int i, int j, int a[], int b[]) {
          int temp = a[i];
          a[i] = b[j];
          b[j] = temp;
     }

     int search(int low, int high, int a[], int key) {
          while (low <= high) {
               int mid = (low + high) / 2;
               if (mid == key)
                    return a[mid];
               else if (key > mid)
                    low = mid + 1;
               else
                    high = mid - 1;
          }
          return -1;
     }

     public static void main(String[] args) {

     }
}
import java.util.*;

public class Three_way_partitioning {
     public void swap(int arr[], int i, int j) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
     }

     public void threeWayPartition(int arr[], int a, int b) {
          int n = arr.length, i = 0, l = 0, r = n - 1;

          while (i <= r) {
               if (arr[i] < a) {
                    swap(arr, l, i);
                    l++;
               }

               else if (arr[i] > b) {
                    swap(arr, i, r);
                    r--;
                    i--;
               }

               i++;
          }
     }

     public static void main(String[] args) {

     }
}
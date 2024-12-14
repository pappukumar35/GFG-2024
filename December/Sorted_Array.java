package December;

public class Sorted_Array {
     int search(int[] arr, int k) {
          int i = 0;
          int n = arr.length;
          int j = n - 1;

          while (i <= j) {
               int mid = (i + j) >> 1;
               if (arr[mid] == k)
                    return mid;
               if (arr[mid] < arr[j]) {
                    if (arr[mid] <= k && k <= arr[j]) {
                         i = mid + 1;
                    } else {
                         j = mid - 1;
                    }
               } else {
                    if (arr[i] <= k && k <= arr[mid]) {
                         j = mid - 1;
                    } else {
                         i = mid + 1;
                    }
               }
          }
          return -1;
     }

     public static void main(String[] args) {

     }
}
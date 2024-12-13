package December;

public class Rotated_Minimum {
     public int findMin(int[] arr) {
          int left = 0;
          int right = arr.length - 1;
          if (arr[left] < arr[right]) {
               return arr[left];
          }

          while (left < right) {
               int mid = left + (right - left) / 2;
               if (mid > 0 && arr[mid] < arr[mid - 1]) {
                    return arr[mid];
               }

               if (arr[mid] >= arr[left] && arr[mid] > arr[right]) {
                    left = mid + 1;
               } else {
                    right = mid - 1;
               }
          }

          return arr[left];
     }

     public static void main(String[] args) {

     }
}
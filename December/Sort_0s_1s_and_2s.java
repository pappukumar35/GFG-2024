package December;

public class Sort_0s_1s_and_2s {
     public void sort012(int[] arr) {

          int l = 0, h = arr.length - 1, mid = 0;

          while (mid <= h) {
               if (arr[mid] == 0) {
                    swap(arr, l, mid);
                    l++;
                    mid++;
               } else if (arr[mid] == 1) {
                    mid++;
               } else {
                    swap(arr, mid, h);
                    h--;
               }
          }

     }

     private static void swap(int[] arr, int i, int h) {
          int temp = arr[i];
          arr[i] = arr[h];
          arr[h] = temp;
     }

     public static void main(String[] args) {

     }
}
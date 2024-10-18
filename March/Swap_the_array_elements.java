public class Swap_the_array_elements {
     public void swapElements(int[] arr, int n) {
          // Code here
          int temp = 0;
          for (int i = 0; i + 2 < n; i++) {
               temp = arr[i];
               arr[i] = arr[i + 2];
               arr[i + 2] = temp;
          }
     }

     public static void main(String[] args) {

     }
}

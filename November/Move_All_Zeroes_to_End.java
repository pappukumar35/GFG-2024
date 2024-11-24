package November;

public class Move_All_Zeroes_to_End {
     void pushZerosToEnd(int[] arr) {
          // code here
          int n = arr.length;
          int position = 0; // Pointer to place non-zero elements

          // Traverse the array and move non-zero elements to the `position` index
          for (int i = 0; i < n; i++) {
               if (arr[i] != 0) {
                    arr[position] = arr[i];
                    position++;
               }
          }

          // Fill the remaining positions with zeros
          while (position < n) {
               arr[position] = 0;
               position++;
          }
     }

     public static void main(String[] args) {

     }
}
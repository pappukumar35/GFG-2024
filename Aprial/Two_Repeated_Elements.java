import java.util.*;

public class Two_Repeated_Elements {
     public int[] twoRepeated(int arr[], int n) {
          int[] ans = new int[2];
          int var = 0;
          for (int i = 0; i < n + 2; i++) {
               int x = Math.abs(arr[i]);
               if (arr[x] < 0) {
                    ans[var] = x;
                    var++;
               }
               arr[x] = -arr[x];
          }
          return ans;

     }

     public static void main(String[] args) {

     }
}
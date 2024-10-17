package Sepetember;

public class Minimize_the_Heights_II {
     int getMinDiff(int[] arr, int k) {
          // code
          int n = arr.length;
          int max = Integer.MAX_VALUE;
          int min = Integer.MIN_VALUE;
          Arrays.sort(arr);
          int res = arr[n - 1] - arr[0];
          for (int i = 1; i < n; i++) {
               if (arr[i] > k) {
                    max = Math.max(arr[i - 1] + k, arr[n - 1] - k);
                    min = Math.min(arr[0] + k, arr[i] - k);
                    res = Math.min(res, max - min);

               } else
                    continue;
          }
          return res;
     }

     public static void main(String[] args) {

     }
}
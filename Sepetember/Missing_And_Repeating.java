package Sepetember;

public class Missing_And_Repeating {
     int[] findTwoElement(int arr[]) {
          // code here
          int[] res = new int[2];
          int[] freq = new int[arr.length];
          for (int i = 0; i < arr.length; i++) {
               freq[arr[i] - 1]++;
               if (freq[arr[i] - 1] > 1) {
                    res[0] = arr[i];
               }
          }
          for (int i = 0; i < freq.length; i++) {
               if (freq[i] == 0) {
                    res[1] = i + 1;
               }
          }
          return res;
     }

     public static void main(String[] args) {

     }
}

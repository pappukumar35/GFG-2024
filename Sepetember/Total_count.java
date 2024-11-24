package Sepetember;

public class Total_count {
     int totalCount(int k, int[] arr) {
          int c = 0;
          for (int i = 0; i < arr.length; i++) {
               c += (arr[i] + k - 1) / k; // Simplified calculation
          }
          return c;
     }

     public static void main(String[] args) {

     }
}
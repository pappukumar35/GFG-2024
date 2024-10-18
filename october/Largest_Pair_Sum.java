package october;

public class Largest_Pair_Sum {
     public static int pairsum(int[] arr) {
          // code here
          int first = -1, second = -1;
          for (int i : arr) {
               if (i > first) {
                    second = first;
                    first = i;
               } else if (i > second) {
                    second = i;
               }
          }
          return first + second;
     }

     public static void main(String[] args) {

     }
}

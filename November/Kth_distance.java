package November;

public class Kth_distance {
     public boolean checkDuplicatesWithinK(int[] arr, int k) {
          int p1 = 0, p2 = 0;
          int count = 0;
          while (p1 < arr.length - 1) {
               // System.out.println(p1+" "+p2);
               if (p2 < p1 + k && p2 < arr.length - 1) {
                    p2++;
               } else {
                    p1++;
                    p2 = p1;
                    count = 0;
               }
               if (arr[p1] == arr[p2]) {
                    count++;
                    if (count == 2)
                         return true;
               }
          }

          return false;
     }

     public static void main(String[] args) {

     }
}
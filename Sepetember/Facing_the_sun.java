package Sepetemeber;

public class Facing_the_sun {
     public int countBuildings(int[] height) {
          if (height.length == 0) {
               return -1;
          }
          if (height.length == 1) {
               return 1;
          }

          int n = height[0];
          int count = 1;
          for (int i = 1; i < height.length; i++) {
               int m = height[i];
               if (n < m) {
                    count++;
                    n = m;
               }
          }
          return count;
     }

     public static void main(String[] args) {

     }
}
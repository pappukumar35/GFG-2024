package Auguest;

import java.util.*;

public class N_meetings_in_one_room {
     public int maxMeetings(int n, int start[], int end[]) {
          int a[][] = new int[n][2];
          int c = 1;
          for (int i = 0; i < n; i++) {
               a[i][0] = start[i];
               a[i][1] = end[i];
          }
          Arrays.sort(a, Comparator.comparingDouble(o -> o[0]));
          int z = a[n - 1][0];
          for (int i = n - 1; i > 0; i--) {
               if (z > a[i - 1][1]) {
                    z = a[i - 1][0];
                    c++;
               }
          }
          return c;
     }

     public static void main(String[] args) {

     }
}

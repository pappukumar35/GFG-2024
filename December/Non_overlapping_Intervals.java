package December;

import java.util.Arrays;

public class Non_overlapping_Intervals {
     static int minRemoval(int intervals[][]) {
          // code here

          Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
          int last = 0;
          int ans = 0;
          int N = intervals.length;
          for (int i = 1; i < N; i++) {
               if (intervals[i][0] < intervals[last][1])
                    ans++;
               else
                    last = i;
          }
          return ans;
     }

     public static void main(String[] args) {

     }
}
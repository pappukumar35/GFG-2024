package May;

import java.util.*;
import java.util.*;

public class Path_With_Minimum_Effort {
     public static int MinimumEffort(int rows, int columns, int[][] heights) {
          // code here
          int[][] effort = new int[rows][columns];
          for (int i = 0; i < rows; i++) {
               Arrays.fill(effort[i], Integer.MAX_VALUE);
          }

          PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]);
          pq.offer(new int[] { 0, 0, 0 }); // (row, col, effort)

          int[][] directions = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

          while (!pq.isEmpty()) {
               int[] curr = pq.poll();
               int row = curr[0];
               int col = curr[1];
               int currEffort = curr[2];

               if (row == rows - 1 && col == columns - 1)
                    return currEffort;

               for (int[] dir : directions) {
                    int newRow = row + dir[0];
                    int newCol = col + dir[1];
                    if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < columns) {
                         int newEffort = Math.max(currEffort, Math.abs(heights[newRow][newCol] - heights[row][col]));
                         if (newEffort < effort[newRow][newCol]) {
                              effort[newRow][newCol] = newEffort;
                              pq.offer(new int[] { newRow, newCol, newEffort });
                         }
                    }
               }
          }

          return -1; // Unreachable
     }

     public static void main(String[] args) {

     }
}
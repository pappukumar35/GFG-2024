package June;

import java.util.*;
import java.util.*;

public class Minimum_Number_of_Moves_to_Seat_Everyone {

     public int minMovesToSeat(int[] seats, int[] students) {
          Arrays.sort(seats);
          Arrays.sort(students);
          int n = seats.length;
          int sum = 0;
          for (int i = 0; i < n; i++) {
               sum += Math.abs(seats[i] - students[i]);
          }
          return sum;
     }

     public static void main(String[] args) {

     }
}
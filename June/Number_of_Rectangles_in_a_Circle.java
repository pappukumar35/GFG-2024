package June;

import java.util.*;

public class Number_of_Rectangles_in_a_Circle {
     int rectanglesInCircle(int radius) {
          int rectangleCount = 0;

          // Iterate through possible x-coordinates within the circle's diameter
          for (int x = 1; x < 2 * radius; x++) {
               int y = 1;
               // Increment y-coordinates while the point (x, y) is within or on the circle
               while (4 * radius * radius >= x * x + y * y) {
                    rectangleCount++; // Count rectangles that can be formed with current (x, y)
                    y++; // Increment y to check the next possible y-coordinate
               }
          }

          return rectangleCount; // Return the total count of rectangles inside the circle
     }

     public static void main(String[] args) {

     }
}
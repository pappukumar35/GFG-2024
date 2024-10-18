package June;

import java.util.*;

public class Find_maximum_volume_of_a_cuboid {
     double maxVolume(double perimeter, double area) {
          double P = perimeter;
          double A = area;
          double sqrtTerm = Math.sqrt(P * P - 24 * A);
          double dimension1 = (P - sqrtTerm) / 12.0;
          double dimension2 = (P / 4.0) - 2 * dimension1;
          double volume = Math.pow(dimension1, 2) * dimension2;
          return Math.round(volume * 100.0) / 100.0;
     }

     public static void main(String[] args) {

     }
}
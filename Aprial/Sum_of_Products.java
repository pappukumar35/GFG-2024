import java.io.*;
import java.util.*;

public class Sum_of_Products {
     static long pairAndSum(int n, long arr[]) {
          // code here
          long sum = 0;
          int k = 1; // bit position value like 8 4 2 1
          for (int i = 0; i < 32; i++) { // travers all bit
               long c = 0; // count how many bits are 1 at i position
               for (int j = 0; j < n; j++) {
                    if ((arr[j] & 1) != 0) {
                         c++;
                    }
                    arr[j] >>= 1;
               }
               long num = (c * (c - 1)) / 2; // count many pair for all 1 bit at i position
               sum += num * k;
               k <<= 1; // bit position value like 8 4 2 1
          }
          return sum;

     }

     public static void main(String[] args) {

     }
}
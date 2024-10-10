import java.io.*;
import java.util.*;

public class Reverse_Bits {
     static Long reversedBits(Long x) {
          // code here
          long num = 0;
          for (int i = 0; i < 32; i++) {
               long bit = (x & (1 << i)) > 0 ? 1 : 0;
               num = num + (bit << (31 - i));
          }
          return num;
     }

     public static void main(String[] args) {
          int n = 5;
          System.out.println(reversedBits(null));

     }
}

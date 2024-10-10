import java.util.*;

public class ACParty_of_Couples {
     static int findSingle(int n, int arr[]) {
          // code here
          int xor = 0;
          for (int ele : arr) {
               xor ^= ele;
          }
          return xor;
     }

     public static void main(String args[]) {
          System.out.println(findSingle(20, null));

     }
}
package June;

import java.util.*;

public class Extract_the_Number_from_the_String {
     long ExtractNumber(String s) {
          // code here
          String arr[] = s.split(" ");
          long max = -1;
          for (String st : arr) {
               if (st.charAt(0) - '0' >= 0 && st.charAt(0) - '0' <= 9) {
                    if (!st.contains("9")) {
                         long convert = Long.parseLong(st);
                         if (convert > max)
                              max = convert;
                    }
               }
          }
          return max;
     }

     public static void main(String[] args) {

     }

}
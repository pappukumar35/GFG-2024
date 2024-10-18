package June;

import java.util.*;

public class Compare_two_fractions {
     String compareFrac(String str) {
          // Code here
          String astr = "", bstr = "", cstr = "", dstr = "";
          int f1 = 1, f2 = 1, f3 = 1, f4 = 1;
          for (int i = 0; i < str.length(); i++) {
               if (f1 == 1) {
                    if (str.charAt(i) == '/') {
                         f1 = 0;
                         continue;
                    }
                    astr += str.charAt(i);
               }
               if (f1 == 0 && f2 == 1) {
                    if (str.charAt(i) == ',') {
                         f2 = 0;
                         continue;
                    }
                    bstr += str.charAt(i);
               }
               if (str.charAt(i) == ' ') {
                    continue;
               }
               if (f1 == 0 && f2 == 0 && f3 == 1) {
                    if (str.charAt(i) == '/') {
                         f3 = 0;
                         continue;
                    }
                    cstr += str.charAt(i);
               }
               if (f1 == 0 && f2 == 0 && f3 == 0) {
                    dstr += str.charAt(i);
               }
          }
          float d1 = (float) (Integer.valueOf(astr));
          float d2 = (float) (Integer.valueOf(bstr));
          float d3 = (float) (Integer.valueOf(cstr));
          float d4 = (float) (Integer.valueOf(dstr));

          if ((d1 / d2) > (d3 / d4)) {
               return (astr + "/" + bstr);
          } else if ((d1 / d2) < (d3 / d4)) {
               return (cstr + "/" + dstr);
          }
          return "equal";
     }

     public static void main(String[] args) {

     }
}
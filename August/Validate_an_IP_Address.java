package Auguest;

import java.util.*;

public class Validate_an_IP_Address {
     public boolean isValid(String str) {
          String PATTERN = "^((0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)\\.){3}(0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)$";
          return str.matches(PATTERN);
     }

     public static void main(String[] args) {

     }
}
package July;
import java.util.*;
public class Remaining_String{
     public String printString(String s, char ch, int count) {

          int occurrence = 0;
          for (int i = 0; i < s.length(); i++) {
              if (s.charAt(i) == ch) {
                  occurrence++;
                  if (occurrence == count) {
                      return s.substring(i + 1);
                  }
              }
          }
  
          return "";
      }
     public static void main(String[] args) {
          
     }
}
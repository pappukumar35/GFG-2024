package June;

import java.util.*;

public class Score_of_a_String {
     public int scoreOfString(String s) {
          int score = 0;
          for (int i = 0; i < s.length() - 1; i++) {
               score += Math.abs(s.charAt(i) - s.charAt(i + 1));
          }
          return score;
     }

     public static void main(String[] args) {

     }
}
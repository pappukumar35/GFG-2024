package December;

import java.util.*;

public class SearchPattern {

     ArrayList<Integer> search(String pat, String txt) {
          ArrayList<Integer> foundPatternList = new ArrayList<>();
          if (txt == null || txt.isEmpty() || pat.length() > txt.length())
               return foundPatternList;
          int index = txt.indexOf(pat);
          while (index != -1) {
               foundPatternList.add(index);
               index = txt.indexOf(pat, index + 1);
          }
          return foundPatternList;
     }

     public static void main(String[] args) {

     }
}
package June;

import java.util.*;
import java.util.*;

public class Print_Bracket_Number {
     ArrayList<Integer> bracketNumbers(String str) {
          // code here
          ArrayList<Integer> arr = new ArrayList<>();
          Stack<Integer> stack = new Stack<>();
          int count = 0;
          for (int i = 0; i < str.length(); i++) {
               char ch = str.charAt(i);
               if (ch == '(') {
                    count++;
                    stack.push(count);
                    arr.add(count);
               } else if (ch == ')') {
                    arr.add(stack.pop());
               }
          }
          return arr;
     }

     public static void main(String[] args) {

     }
}
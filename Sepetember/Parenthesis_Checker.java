package Sepetember;

import java.util.Stack;

public class Parenthesis_Checker {
     static boolean ispar(String x) {
          // add your code here
          Stack<Character> stack = new Stack<>();
          for (int i = 0; i < x.length(); i++) {
               char ch = x.charAt(i);

               // if stack is empty push the char i
               if (stack.isEmpty()) {
                    stack.push(ch);

               } else {
                    // checking valid orders
                    if (ch == ')' && stack.peek() == '(')
                         stack.pop();

                    else if (ch == ']' && stack.peek() == '[')
                         stack.pop();

                    else if (ch == '}' && stack.peek() == '{')
                         stack.pop();

                    else
                         stack.push(ch);
               }
          }
          if (stack.isEmpty())
               return true;
          return false;
     }

     public static void main(String[] args) {

     }
}
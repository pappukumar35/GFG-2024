package Sepetember;

import java.util.Stack;

public class Longest_valid_Parentheses {
     static int maxLength(String str) {
          int n = str.length();
          boolean seen[] = new boolean[n];
          Stack<Integer> st = new Stack<>();
          int i = 0;
          while (i < n) {
               if (str.charAt(i) == '(') {
                    st.push(i);
               } else {
                    if (!st.isEmpty() && str.charAt(st.peek()) == '(') {
                         int tem = st.pop();
                         seen[tem] = true;
                         seen[i] = true;
                    }
               }
               i++;
          }

          int cnt = 0;
          int ans = 0;
          for (int j = 0; j < n; j++) {
               if (seen[j] == true)
                    cnt++;
               else
                    cnt = 0;
               ans = Math.max(ans, cnt);
          }
          return ans;
     }

     public static void main(String[] args) {

     }
}
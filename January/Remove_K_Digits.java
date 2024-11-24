import java.util.Stack;

class Remove_K_Digits {
    public String removeKdigits(String S, int k) {
        // code here
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            while (!st.isEmpty() && st.peek() > S.charAt(i) && k > 0) {
                st.pop();
                k--;
            }
            st.add(S.charAt(i));

        }
        while (k-- > 0) {
            st.pop();
        }
        if (st.isEmpty())
            return "0";
        StringBuilder ans = new StringBuilder();
        while (!st.isEmpty()) {
            ans.append(st.pop() + "");
        }
        ans = ans.reverse();
        int index = 0;
        while (index < ans.length() - 1 && ans.charAt(index) == '0') {
            index++;
        }
        return ans.substring(index);
    }
}
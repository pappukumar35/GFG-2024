public class Insert_an_Element_at_the_Bottom_of_a_Stack {
     public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
          Stack<Integer> s = new Stack<>();
          while (!st.isEmpty()) {
               s.push(st.pop());
          }
          st.push(x);
          while (!s.isEmpty()) {
               st.push(s.pop());
          }
          return st;
     }

     public static void main(String[] args) {

     }
}

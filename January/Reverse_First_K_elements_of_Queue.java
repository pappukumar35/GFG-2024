import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Reverse_First_K_elements_of_Queue {
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // add code here.
        Queue<Integer> t = new LinkedList<>();
        Stack<Integer> s = new Stack<Integer>();
        while (k > 0 && !q.isEmpty()) {
            s.push(q.remove());
            k--;
        }
        while (!s.isEmpty()) {
            t.offer(s.pop()); // Use offer for clarity
        }
        while (!q.isEmpty()) {
            t.offer(q.remove());
        }
        return t;

    }
}
import java.util.*;

class ZigZag_Tree_Traversal {
     static class Node {

     }

     ArrayList<Integer> zigZagTraversal(Node root) {
          // Add your code here.
          Stack<Node> st1 = new Stack<>();
          Stack<Node> st2 = new Stack<>();
          boolean flag = true;
          ArrayList<Integer> list = new ArrayList<>();
          st1.push(root);
          while (!st1.isEmpty() || !st2.isEmpty()) {
               if (flag) {
                    int size = st1.size();
                    while (size-- > 0) {
                         Node temp = st1.pop();
                         list.add(temp.data);
                         if (temp.left != null)
                              st2.push(temp.left);
                         if (temp.right != null)
                              st2.push(temp.right);
                    }
               } else {
                    int size = st2.size();
                    while (size-- > 0) {
                         Node temp = st2.pop();
                         list.add(temp.data);
                         if (temp.right != null)
                              st1.push(temp.right);
                         if (temp.left != null)
                              st1.push(temp.left);
                    }
               }
               flag = flag ? false : true;
          }
          return list;
     }

     public static void main(String[] args) {

     }
}
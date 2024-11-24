import java.util.*;

class Kth_common_ancestor_in_BST {
     public int kthCommonAncestor(Node root, int k, int x, int y) {
          // code here
          ArrayList<Integer> al = new ArrayList<>();
          while (root != null) {
               al.add(root.data);
               if (x < root.data && y < root.data)
                    root = root.left;
               else if (x > root.data && y > root.data)
                    root = root.right;
               else
                    break;
          }
          if (k > al.size()) {
               return -1;
          } else {
               return al.get(al.size() - k);
          }
     }

     public static void main(String[] args) {

     }

}
package July;

import java.util.*;

public class Construct_Binary_Tree_from_Parent_Array {
     public Node createTree(int parent[]) {
          // Your code here
          int n = parent.length;
          HashMap<Integer, Integer> hm = new HashMap<>();
          Node[] arr = new Node[n];

          if (n == 0)
               return null;

          for (int i = 0; i < n; i++) {
               hm.put(i, 2);
               arr[i] = new Node(i);
          }
          Node root = null;

          for (int i = 0; i < n; i++) {
               if (parent[i] != -1) {
                    if (hm.get(parent[i]) == 2) {
                         arr[parent[i]].left = arr[i];
                         hm.put(parent[i], 1);
                    } else {
                         arr[parent[i]].right = arr[i];
                    }
               } else {
                    root = arr[i];
               }
          }

          return root;
     }

     public static void main(String[] args) {

     }
}
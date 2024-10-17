package July;

import java.util.*;

public class Make_Binary_Tree_From_Linked_List {
     static class Treenode {
          int data;
          Treenode next;
          Treenode Tree;

          Treenode(int data) {
               this.data = data;
               this.next = next;
               this.Tree = Tree;
          }

     }

     public Tree convert(Node head, Tree node) {
          ArrayList<Integer> al = new ArrayList<>();

          Node temp = head;
          while (temp != null) {
               al.add(temp.data);
               temp = temp.next;
          }

          return makeTree(al, 0, node);
     }

     public static Tree makeTree(ArrayList<Integer> al, int index, Tree node) {
          if (index >= al.size()) {
               return null;
          }

          node = new Tree(al.get(index));
          node.left = makeTree(al, 2 * index + 1, node.left);
          node.right = makeTree(al, 2 * index + 2, node.right);

          return node;
     }

     public static void main(String[] args) {

     }
}
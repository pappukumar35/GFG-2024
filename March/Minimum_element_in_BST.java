import java.io.*;
import java.util.*;

import org.w3c.dom.Node;

public class Minimum_element_in_BST {
     int minValue(Node root) {
          // code here

          // in a BST leftmost node is the min element
          // we keep traversing to the left till null is hit and return the node
          return (root.left == null) ? root.data : minValue(root.left);

     }

     int minValue(Node root) {
          // code here

          // in a BST leftmost node is the min element
          // we keep traversing to the left till null is hit and return the node
          return (root.left == null) ? root.data : minValue(root.left);

     }

     public static int minValue(Node root) {
          // code here

          // in a BST leftmost node is the min element
          // we keep traversing to the left till null is hit and return the node
          return (root.left == null) ? root.data : minValue(root.left);

     }

     public static void main(String[] args) {

     }
}

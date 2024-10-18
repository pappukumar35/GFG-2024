class Closest_Neighbour_in_BST {
     public static void main(String[] args) {
          public static int findMaxForN(Node root, int n) {
               if(root == null)
                   return -1;
               if(root.key <= n)
               {
                   return Math.max(root.key, findMaxForN(root.right, n));
               }else{
                   return findMaxForN(root.left, n);
               }
           }
     }
}
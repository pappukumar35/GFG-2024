class Check_for_Children_Sum_Property_in_a_Binary_Tree {
          public static boolean check(Node root) {
                    if (root == null || root.left == null && root.right == null)
                              return true;
                    boolean left = check(root.left);
                    boolean right = check(root.right);
                    int le = 0;
                    int ri = 0;
                    if (root.left != null)
                              le = root.left.data;
                    if (root.right != null)
                              ri = root.right.data;
                    boolean c = le + ri == root.data;
                    if (left && right && c)
                              return true;
                    else
                              return false;
          }

          public static int isSumProperty(Node root) {
                    // add your code here
                    if (check(root))
                              return 1;
                    else
                              return 0;

          }
}
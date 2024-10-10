class Check_if_all_leaves_are_at_same_level {
          boolean check(Node root) {
                    return checkSameLevel(root, 0);
          }

          private boolean checkSameLevel(Node node, int level) {
                    if (node == null)
                              return true;

                    // Check if it's a leaf node
                    if (node.left == null && node.right == null) {
                              if (leafLevel == -1)
                                        leafLevel = level;
                              else if (level != leafLevel)
                                        return false;
                              return true;
                    }

                    // Recursively check left and right subtrees
                    return checkSameLevel(node.left, level + 1) && checkSameLevel(node.right, level + 1);
          }

          private int leafLevel = -1;
}
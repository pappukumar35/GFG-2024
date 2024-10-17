class Count_the_nodes_at_distance_K_from_leaf {
    public int printKDistantfromLeaf(Node root, int k) {
        if (root == null) {
            return 0;
        }

        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
        int count = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            while (size-- > 0) {
                Node current = queue.remove();

                if (isKDistanceFromLeaf(current, k)) {
                    count++;
                }

                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
        }

        return count;
    }

    // Helper function to check if the node is at K distance from leaf nodes.
    private boolean isKDistanceFromLeaf(Node node, int k) {
        if (node == null) {
            return false;
        }

        if ((node.left == null && node.right == null) && k == 0) {
            return true;
        }

        if ((node.left == null && node.right == null) || k <= 0) {
            return false;
        }

        boolean leftResult = isKDistanceFromLeaf(node.left, k - 1);
        boolean rightResult = isKDistanceFromLeaf(node.right, k - 1);

        return leftResult || rightResult;
    }
}
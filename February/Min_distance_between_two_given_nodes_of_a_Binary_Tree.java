class Min_distance_between_two_given_nodes_of_a_Binary_Tree {
    int ans = 0;

    public int findDist(Node root, int a, int b) {
        if (a == b) {
            return 0;
        }
        ans = 0;

        lca(root, a, b);
        return ans;
    }

    private int lca(Node node, int a, int b) {
        if (node == null) {
            return 0;
        }

        int lh = lca(node.left, a, b);
        int rh = lca(node.right, a, b);

        if (node.data == a || node.data == b) {
            if (lh > 0) {
                ans = lh;
            } else if (rh > 0) {
                ans = rh;
            } else {
                return 1;
            }
        }

        if (lh > 0 && rh > 0) {
            ans = lh + rh;
        } else if (rh != 0) {
            return rh + 1;
        } else if (lh != 0) {
            return lh + 1;
        }

        return 0;
    }
}
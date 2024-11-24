class Paths_from_root_with_a_specified_sum {
    public static void helper(Node root, int sum, ArrayList<ArrayList<Integer>> list, ArrayList<Integer> ans) {
        if (root == null)
            return;
        ans.add(root.data);
        int fin = 0;
        for (int i = ans.size() - 1; i >= 0; i--) {
            fin += ans.get(i);
        }
        if (fin == sum)
            list.add(new ArrayList<>(ans));
        helper(root.left, sum, list, ans);
        helper(root.right, sum, list, ans);
        ans.remove(ans.size() - 1);
    }

    public static ArrayList<ArrayList<Integer>> printPaths(Node root, int sum) {
        // code here
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        helper(root, sum, list, new ArrayList<Integer>());
        return list;
    }
}
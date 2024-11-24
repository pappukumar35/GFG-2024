class All_Unique_Permutations_of_an_array {
    private static ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr, int n) {
        // Sort the input array to handle duplicates
        list.clear();
        Collections.sort(arr);

        ArrayList<Integer> ll = new ArrayList<>();
        backtrack(ll, arr, new boolean[n]);
        return list;
    }

    public static void backtrack(ArrayList<Integer> ll, ArrayList<Integer> arr, boolean[] used) {
        if (ll.size() == arr.size()) {
            list.add(new ArrayList<>(ll));
            return;
        }

        for (int i = 0; i < arr.size(); i++) {
            // Skip duplicates
            if (used[i] || (i > 0 && arr.get(i).equals(arr.get(i - 1)) && !used[i - 1])) {
                continue;
            }

            ll.add(arr.get(i));
            used[i] = true;
            backtrack(ll, arr, used);
            used[i] = false;
            ll.remove(ll.size() - 1);
        }
    }
}
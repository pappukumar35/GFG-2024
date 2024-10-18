class Find_duplicate_rows_in_a_binary_matrix {
    public static ArrayList<Integer> repeatedRows(int matrix[][], int m, int n) {
        HashSet<List<Integer>> s = new HashSet<>();
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            List<Integer> l = new ArrayList<>();
            for (int j = 0; j < n; j++)
                l.add(matrix[i][j]);

            if (!s.contains(l))
                s.add(l);
            else
                res.add(i);
        }

        return res;
    }

}
class Top_k_numbers_in_a_stream {
    public static ArrayList<ArrayList<Integer>> kTop(int[] arr, int n, int k) {
        // code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> {
            if (map.get(a) != map.get(b))
                return map.get(b) - map.get(a);
            else
                return a - b;
        });

        ArrayList<Integer> temp = new ArrayList<>();
        for (int ele : arr) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
            maxHeap = new PriorityQueue<>((a, b) -> {
                if (map.get(a) != map.get(b))
                    return map.get(b) - map.get(a);
                else
                    return a - b;
            });
            for (int key : map.keySet()) {
                maxHeap.add(key);
            }
            int tempK = k;
            temp.clear();
            while (tempK > 0 && !maxHeap.isEmpty()) {
                int a = maxHeap.poll();
                temp.add(a);
                tempK--;
            }
            res.add(new ArrayList<>(temp));
        }
        return res;
    }
}
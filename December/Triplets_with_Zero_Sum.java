package December;

public class Triplets_with_Zero_Sum {
     public List<List<Integer>> findTriplets(int[] arr) {
          // Your code here
          List<List<Integer>> ans = new ArrayList<>();
          HashMap<Integer, List<Integer>> map = new HashMap<>();
          int n = arr.length;

          for (int i = 0; i < n; i++) {
               if (!map.containsKey(arr[i])) {
                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    map.put(arr[i], list);
               } else {
                    List<Integer> list = map.get(arr[i]);
                    list.add(i);
               }
          }

          for (int i = 0; i < n - 1; i++) {
               for (int j = i + 1; j < n; j++) {
                    int sum = arr[i] + arr[j];
                    if (map.containsKey(-sum)) {
                         List<Integer> list = map.get(-sum);
                         for (int k : list) {
                              if (k > j) {
                                   List tmp = new ArrayList<>();
                                   tmp.add(i);
                                   tmp.add(j);
                                   tmp.add(k);
                                   ans.add(tmp);
                              }
                         }
                    }
               }
          }

          return ans;
     }

     public static void main(String[] args) {

     }
}
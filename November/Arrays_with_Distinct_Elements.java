package November;

public class Arrays_with_Distinct_Elements {
     public static ArrayList<Integer> findUnion(int a[], int b[]) {
          ArrayList<Integer> ans = new ArrayList<>();
          HashSet<Integer> set = new HashSet<>();

          for (int i = 0; i < a.length; i++) {
               set.add(a[i]);
          }

          for (int j = 0; j < b.length; j++) {
               set.add(b[j]);
          }

          ans.addAll(set);

          // Sorting the result list if order is required
          Collections.sort(ans);

          return ans;
     }

     public static void main(String[] args) {

     }
}
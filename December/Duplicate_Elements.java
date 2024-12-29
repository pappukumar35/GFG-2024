package December;

public class Duplicate_Elements {
     public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
          // code here
          ArrayList<Integer> arr = new ArrayList();
          HashSet<Integer> set = new HashSet<>();
          for (int i : a) {
               set.add(i);
          }

          for (int i : b) {
               if (set.contains(i) && !arr.contains(i)) {
                    arr.add(i);
               }
          }
          Collections.sort(arr);

          return arr;

     }

     public static void main(String[] args) {

     }
}
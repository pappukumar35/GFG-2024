package December;

public class Duplicate_Array {
     public static int findUnion(int a[], int b[]) {
          Set<Integer> s = new HashSet<>();
          Arrays.stream(a).forEach(num -> s.add(num));
          Arrays.stream(b).forEach(num -> s.add(num));

          return s.size();
     }

     public static void main(String[] args) {

     }
}
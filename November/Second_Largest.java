package November;

public class Second_Largest {
     public int getSecondLargest(int[] arr) {
          // Code Here
          HashSet<Integer> ll = new HashSet<Integer>();
          for (int i = 0; i < arr.length; i++) {
               ll.add(arr[i]);
          }
          if (ll.size() == 1) {
               return -1;
          }
          ArrayList<Integer> list = new ArrayList<Integer>(ll);
          Collections.sort(list);
          return list.get(list.size() - 2);
     }

     public static void main(String[] args) {

     }
}
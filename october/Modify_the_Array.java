package october;

public class Modify_the_Array {
     static ArrayList<Integer> modifyAndRearrangeArr(int arr[]) {

          ArrayList<Integer> al = new ArrayList<>();
          int n = arr.length;
          int zero = 0;

          for (int i = 0; i < n - 1; i++) {
               if (arr[i] != 0 && arr[i] == arr[i + 1]) {
                    al.add(arr[i] * 2);
                    arr[i + 1] = 0;
               } else {
                    if (arr[i] == 0)
                         zero++;
                    else
                         al.add(arr[i]);
               }
          }
          al.add(arr[n - 1]);
          for (int i = 0; i < zero; i++) {
               al.add(al.size(), 0);
          }
          return al;
     }

     public static void main(String[] args) {

     }
}
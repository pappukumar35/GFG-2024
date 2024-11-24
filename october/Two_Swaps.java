package october;

public class Two_Swaps {
     public boolean checkSorted(List<Integer> arr) {
          // code here
          int n = arr.size(), swap = 0;
          for (int i = 0; i < n;) {
               if (arr.get(i) != i + 1) {
                    swap(arr, i, arr.get(i) - 1);
                    swap++;
               } else {
                    i++;
               }
          }
          return swap == 0 || swap == 2;
     }

     public void swap(List<Integer> arr, int i, int j) {
          int temp = arr.get(j);
          arr.set(j, arr.get(i));
          arr.set(i, temp);
     }

     public static void main(String[] args) {

     }
}
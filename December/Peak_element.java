package December;

public class Peak_element {
     public int peakElement(int[] arr) {
          int i;
          for (i = 0; i < arr.length - 1; i++)
               if (arr[i] > arr[i + 1])
                    break;
          return i;
     }

     public static void main(String[] args) {

     }
}
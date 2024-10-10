class Peak_element {
     public int peakElement(int[] arr, int n) {
          int i = 0, j = n - 1;
          int peak = 0;
          while (i < j) {
               if (arr[i] < arr[j]) {
                    peak = j;
                    i++;
               } else if (arr[i] >= arr[j]) {
                    peak = i;
                    j--;
               }
          }
          return peak;
     }

     public static void main(String[] args) {

     }

}
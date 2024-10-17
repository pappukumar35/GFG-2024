class Does_array_represent_Heap {
     public boolean countSub(long arr[], long n) {
          // Your code goes here
          for (int i = 0; i < n; i++) {
               if ((2 * i + 1 < n && arr[i] < arr[2 * i + 1]) || (2 * i + 2 < n && arr[i] < arr[2 * i + 2]))
                    return false;
          }
          return true;
     }
}
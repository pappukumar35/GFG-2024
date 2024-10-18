class Maximum_Index {
     static int maxIndexDiff(int arr[], int n) {

          int minVal[] = new int[n];
          int maxVal[] = new int[n];

          // for min : minVal[i] = min(arr[i],arr[i-1]);
          minVal[0] = arr[0];
          for (int i = 1; i < n; i++) {
               minVal[i] = Math.min(arr[i], minVal[i - 1]);
          }

          // for max : maxVal[i] = max(arr[i],maxVal[i+1]);
          maxVal[n - 1] = arr[n - 1];
          for (int i = n - 2; i >= 0; i--) {
               maxVal[i] = Math.max(arr[i], maxVal[i + 1]);
          }
          int i = 0;
          int j = 0;
          int ans = Integer.MIN_VALUE;
          while (i < n && j < n) {
               if (minVal[i] <= maxVal[j]) {// Given : a[i] < a[j] and i < j
                    ans = Math.max(ans, j - i);
                    j++;
               } else {
                    i++;
               }
          }
          return ans;
     }
}
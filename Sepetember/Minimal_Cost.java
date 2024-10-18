public class Minimal_Cost {
     public int minimizeCost(int k, int arr[]) {
          // code here

          int n = arr.length;
          int dp[] = new int[n];

          Arrays.fill(dp, -1);

          return solve(0, arr, dp, k);

     }

     int solve(int st, int arr[], int dp[], int k) {

          int n = arr.length;

          if (st >= n - 1)
               return 0;

          if (dp[st] != -1)
               return dp[st];

          int cost = (int) 1e8;

          for (int i = st + 1; i <= Math.min(st + k, n - 1); i++) {

               cost = Math.min(Math.abs(arr[st] - arr[i]) + solve(i, arr, dp, k), cost);
          }

          dp[st] = cost;

          return dp[st];
     }

     public static void main(String[] args) {

     }
}

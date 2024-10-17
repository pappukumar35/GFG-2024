class Buy_and_Sell_a_Share_at_most_twice {
     public static int maxProfit(int n, int[] price) {
          if (n <= 1) {
               return 0;
          }

          int[] leftProfit = new int[n];
          int[] rightProfit = new int[n];

          // Calculate maximum profit if buying and selling only on the left side of the
          // array
          int minPrice = price[0];
          for (int i = 1; i < n; i++) {
               minPrice = Math.min(minPrice, price[i]);
               leftProfit[i] = Math.max(leftProfit[i - 1], price[i] - minPrice);
          }

          // Calculate maximum profit if buying and selling only on the right side of the
          // array
          int maxPrice = price[n - 1];
          for (int i = n - 2; i >= 0; i--) {
               maxPrice = Math.max(maxPrice, price[i]);
               rightProfit[i] = Math.max(rightProfit[i + 1], maxPrice - price[i]);
          }

          int maxProfit = 0;
          // Find the maximum combined profit
          for (int i = 0; i < n; i++) {
               maxProfit = Math.max(maxProfit, leftProfit[i] + rightProfit[i]);
          }

          return maxProfit;
     }
}
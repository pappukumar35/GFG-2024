package November;

public class Stock_Buy_and_Sell_Multiple_Transaction_Allowed {
     public int maximumProfit(int prices[]) {
          // code here
          int profit = 0;
          int min = prices[0];
          for (int i = 1; i < prices.length; ++i) {
               if (min < prices[i]) {
                    profit += (prices[i] - min);
               }
               min = prices[i];
          }
          return profit;
     }

     public static void main(String[] args) {

     }

}

package November;

public class Stock_Buy_and_Sell {
     public int maxmumProfit(int prices[]) {
          int min = prices[0];
          int res = 0;
          for (int i = 0; i < prices.length; i++) {
               res = Math.max(res, prices[i] - min);
               min = Math.min(min, prices[i]);
          }
          return res;
     }

     public static void main(String[] args) {

     }
}
package June;

import java.util.*;
import java.util.*;

public class Maximum_Tip_Calculator {
     public static long maxTip(int n, int x, int y, int[] arr, int[] brr) {
          class Order {
               int tipA;
               int tipB;
               int diff;

               public Order(int tipA, int tipB) {
                    this.tipA = tipA;
                    this.tipB = tipB;
                    this.diff = Math.abs(tipA - tipB);
               }
          }

          Order[] orders = new Order[n];

          for (int i = 0; i < n; i++) {
               orders[i] = new Order(arr[i], brr[i]);
          }

          Arrays.sort(orders, new Comparator<Order>() {
               public int compare(Order o1, Order o2) {
                    return o2.diff - o1.diff;
               }
          });

          long totalTip = 0;
          int countA = 0, countB = 0;

          for (Order order : orders) {
               if ((order.tipA >= order.tipB && countA < x) || countB == y) {
                    totalTip += order.tipA;
                    countA++;
               } else {
                    totalTip += order.tipB;
                    countB++;
               }
          }

          return totalTip;

     }

     public static void main(String[] args) {

     }
}

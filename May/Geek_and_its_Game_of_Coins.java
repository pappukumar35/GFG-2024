package May;

import java.util.*;

public class Geek_and_its_Game_of_Coins {
     public static int findWinner(int n, int x, int y) {
          // code here
          boolean dp[] = new boolean[n + 1];
          for (int i = 1; i <= n; i++) {
               if ((i >= 1 && !dp[i - 1]) || (i >= x && !dp[i - x]) || (i >= y && !dp[i - y]))
                    dp[i] = true;
          }
          return dp[n] ? 1 : 0;
     }

     public static void main(String[] args) {

     }
}
package october;

public class Split_the_Array {
     private static final int MOD = 1000000007;

     public static int countgroup(int arr[]) {
          // Complete the function
          int totalXOR = 0;
          for (int num : arr) {
               totalXOR ^= num;
          }
          if (totalXOR != 0) {
               return 0;
          }
          int n = arr.length;
          long result = modPow(2, n - 1, MOD) - 1;

          if (result < 0) {
               result += MOD;
          }

          return (int) result;
     }

     private static long modPow(long base, long exp, long mod) {
          long result = 1;
          while (exp > 0) {
               if ((exp & 1) == 1) {
                    result = (result * base) % mod;
               }
               base = (base * base) % mod;
               exp >>= 1;
          }
          return result;
     }

     public static void main(String[] args) {

     }
}
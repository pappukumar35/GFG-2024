public class Search_Pattern_Rabin_Karp_Algorithm_Microsoft {
     public final static int d = 256;

     ArrayList<Integer> search(String pattern, String text) {
          ArrayList<Integer> arr = new ArrayList<>();
          return searchHelper(pattern, text, 11, arr);
     }

     private static ArrayList<Integer> searchHelper(String pattern, String text, int q, ArrayList<Integer> arr) {

          int m = pattern.length();
          int n = text.length();
          int i, j;
          int p = 0;
          int t = 0;
          int h = 1;
          for (i = 0; i < m - 1; i++) {
               h = (h * d) % q;
          }
          for (i = 0; i < m; i++) {
               p = (d * p + pattern.charAt(i)) % q;
               t = (d * t + text.charAt(i)) % q;
          }
          for (i = 0; i <= n - m; i++) {
               if (p == t) {
                    for (j = 0; j < m; j++) {
                         if (text.charAt(i + j) != pattern.charAt(j)) {
                              break;
                         }
                    }
                    if (j == m) {
                         arr.add(i + 1);
                    }
               }
               if (i < n - m) {
                    t = (d * (t - text.charAt(i) * h) + text.charAt(i + m)) % q;
                    if (t < 0) {
                         t = t + q;
                    }
               }
          }
          return arr;
     }
}

class Boolean_Parenthesization {
     static int mod = 1003;

     static class pair {
          int f;
          int s;

          pair(int f, int s) {
               this.f = f;
               this.s = s;
          }
     }

     static pair solve(int l, int r, String s, pair dp[][]) {
          if (l == r) {
               if (s.charAt(l) == 'T')
                    return new pair(1, 0);
               else
                    return new pair(0, 1);
          }
          if (dp[l][r] != null)
               return dp[l][r];
          int first = 0;
          int second = 0;
          for (int i = l + 1; i < r; i++) {
               if (s.charAt(i) == 'T' || s.charAt(i) == 'F')
                    continue;

               pair left = solve(l, i - 1, s, dp);
               pair right = solve(i + 1, r, s, dp);

               if (s.charAt(i) == '|') {
                    first = (first + (left.f * right.f) + (left.f * right.s) + (left.s * right.f)) % mod;
                    second = (second + (left.s * right.s)) % mod;
               } else if (s.charAt(i) == '&') {
                    first = (first + (left.f * right.f)) % mod;
                    second = (second + (left.s * right.s) + (left.f * right.s) + (left.s * right.f)) % mod;
               } else if (s.charAt(i) == '^') {
                    first = (first + (left.f * right.s) + (left.s * right.f)) % mod;
                    second = (second + (left.s * right.s) + (left.f * right.f)) % mod;
               }

          }
          return dp[l][r] = new pair(first, second);
     }

     static int countWays(int n, String s) {
          int ans[] = new int[1];
          pair dp[][] = new pair[n][n];
          // for(row[]:dp)Arrays.fill(row,-1);
          return solve(0, n - 1, s, dp).f;
     }
}
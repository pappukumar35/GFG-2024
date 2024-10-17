class Word_Break {
     public static boolean memo(int i, String s, ArrayList<String> dict, Boolean dp[]) {
          if (i == s.length())
               return true;
          if (dp[i] != null)
               return dp[i];
          for (int j = i + 1; j <= s.length(); j++) {
               String sub = s.substring(i, j);
               if (dict.contains(sub) && memo(j, s, dict, dp))
                    return dp[i] = true;
          }
          return dp[i] = false;
     }

     public static int wordBreak(int n, String s, ArrayList<String> dictionary) {
          // code here
          return memo(0, s, dictionary, new Boolean[s.length() + 1]) ? 1 : 0;
     }
}
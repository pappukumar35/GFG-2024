class Longest_repeating_and_non_overlapping_substring{
     static String longestSubstring(String s, int n) {
          // code here
          int[][] t = new int[n+1][n+1];
          int max = 0;
          int ind = -1;
          for(int i=1;i<=n;i++){
              for(int j=i+1;j<=n;j++){
                  if(s.charAt(i-1)==s.charAt(j-1)){
                      t[i][j] = 1+t[i-1][j-1];
                      // max length is j-i for non-overlapping
                      if(max < Math.min(j-i,t[i][j])){ 
                          ind = j;
                          max = Math.min(j-i,t[i][j]);
                      }
                  }
              }
          }
          if(ind==-1) return "-1";
          return s.substring(ind-max,ind);
      }
}
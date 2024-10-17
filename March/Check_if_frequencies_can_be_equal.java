class Check_if_frequencies_can_be_equal {
     boolean sameFreq(String s) {
          int freq[] = new int[26];
          int size = 0, minFreq = Integer.MAX_VALUE;
          HashSet<Integer> set = new HashSet<>();

          for (int i = 0; i < s.length(); i++) {
               freq[s.charAt(i) - 'a']++;
          }

          for (int i = 0; i < 26; i++) {
               if (freq[i] != 0) {
                    size += freq[i];
                    minFreq = Math.min(minFreq, freq[i]);
               }
          }

          int minCount = 0;
          for (int i = 0; i < 26; i++) {
               if (freq[i] == minFreq) {
                    minCount += minFreq;
               }
          }

          int c = 0, flag = 0;

          if (size == minCount || size - 1 == minCount + minFreq)
               return true;
          else if (minFreq == 1) {
               for (int i = 0; i < 26; i++) {
                    if (freq[i] != 1 && freq[i] != 0) {
                         if (flag == 0) {
                              c = freq[i];
                              flag = 1;
                         } else {
                              if (freq[i] != c)
                                   return false;
                         }
                    }
               }
               return true;
          }
          return false;
     }
}
package December;

public class Longest_Consecutive_Subsequence {
     public int longestConsecutive(int[] arr) {
          if (arr == null || arr.length == 0) {
               return 0;
          }
          HashSet<Integer> set = new HashSet<>();

          for (int num : arr) {
               set.add(num);
          }
          int longestStreak = 0;
          for (int num : arr) {
               if (!set.contains(num - 1)) {
                    int currentNum = num;
                    int currentStreak = 1;
                    while (set.contains(currentNum + 1)) {
                         currentNum += 1;
                         currentStreak += 1;
                    }
                    longestStreak = Math.max(longestStreak, currentStreak);
               }
          }

          return longestStreak;
     }

     public static void main(String[] args) {

     }
}
package october;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Majority_Vote {
     public List<Integer> findMajority(List<Integer> nums) {
          // answer list
          List<Integer> ans = new ArrayList<>();
          // no. of votes for majority
          int mVotes = nums.size() / 3;
          // map to map candidate with no. of votes
          Map<Integer, Integer> map = new HashMap<>();
          for (int i : nums) {
               map.put(i, map.getOrDefault(i, 0) + 1);
          }
          // adding candidate who get more than majority into answer list
          for (Integer key : map.keySet()) {
               if (map.get(key) > mVotes) {
                    ans.add(key);
               }
          }

          if (ans.size() == 0) {
               ans.add(-1);
          }

          Collections.sort(ans);

          return ans;
     }

     public static void main(String[] args) {

     }
}
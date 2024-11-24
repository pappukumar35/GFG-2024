package october;

import java.util.*;

public class Reorganize_The_Array {
     public List<Integer> rearrange(List<Integer> arr) {
          // Code here
          HashSet<Integer> set = new HashSet<>();
          List<Integer> ans = new ArrayList<>();
          for (int i = 0; i < arr.size(); i++) {
               set.add(arr.get(i));
          }
          for (int i = 0; i < arr.size(); i++) {
               if (set.contains(i))
                    ans.add(i);
               else
                    ans.add(-1);
          }
          return ans;
     }

     public static void main(String[] args) {

     }
}
package November;

import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Majority_Element {
     public List<Integer> findMajority(int[] nums) {
          // Your code goes here.
          int n = nums.length;
          int one_third = n / 3;
          HashMap<Integer, Integer> map = new HashMap<>();
          List<Integer> res = new ArrayList<>();

          for (int a : nums) {
               map.put(a, map.getOrDefault(a, 0) + 1);
          }

          for (Integer key : map.keySet()) {
               if (map.get(key) > one_third)
                    res.add(key);
          }

          return res;
     }

     public static void main(String[] args) {

     }
}
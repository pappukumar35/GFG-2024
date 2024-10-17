package Auguest;

import java.util.List;

public class Max_sum_path_in_two_arrays {
     public int maxPathSum(List<Integer> arr1, List<Integer> arr2) {
          // code here
          int i = 0, j = 0, sum1 = 0, sum2 = 0, total = 0;
          while (i < arr1.size() && j < arr2.size()) {
               if (arr1.get(i) < arr2.get(j))
                    sum1 += arr1.get(i++);
               else if (arr2.get(j) < arr1.get(i))
                    sum2 += arr2.get(j++);
               else {
                    total += Math.max(sum1, sum2) + arr1.get(i);
                    sum1 = 0;
                    sum2 = 0;
                    i++;
                    j++;
               }
          }
          while (i < arr1.size())
               sum1 += arr1.get(i++);
          while (j < arr2.size())
               sum2 += arr2.get(j++);
          return total + Math.max(sum1, sum2);
     }

     public static void main(String[] args) {

     }
}
package october;

import java.util.*;

public class RemoveDuplicates {
     class Solution {
          ArrayList<Integer> removeDuplicate(int arr[]) {
               // code here
               int count[] = new int[100];
               for (int x : arr) {
                    if (count[x] == 0)
                         count[x] = 1;
               }

               ArrayList<Integer> result = new ArrayList<>();
               for (int x : arr) {
                    if (count[x] != 0) {
                         result.add(x);
                         count[x] = 0;
                    }
               }
               return result;
          }
     }

     public static void main(String[] args) {

     }
}
package Auguest;

import java.util.*;

public class Maximize_Array_Value_After_Rearrangement {
     int Maximize(int arr[]) {
          Arrays.sort(arr);
          long store = 0;
          long mod = 1000000007;
          for (int i = 0; i < arr.length; i++) {
               store = (store + (long) arr[i] * i) % mod;
          }
          return (int) store;
     }

     public static void main(String[] args) {

     }

}
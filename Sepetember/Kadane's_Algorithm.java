package Sepetember;

public class Kadane's_Algorithm{
     long maxSubarraySum(int[] arr) {

          // Your code here
          int currs = 0;
          int max = Integer.MIN_VALUE;
  
          for(int i = 0; i < arr.length; i++) {
              currs += arr[i];
              max = Math.max(max, currs);
              
              if (currs < 0) {
                  currs = 0;
              }
          }
          
          return max;
      }
     public static void main(String args[]){

     }
}
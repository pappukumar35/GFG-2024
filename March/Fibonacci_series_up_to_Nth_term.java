import java.io.*;
import java.util.*;

public class Fibonacci_series_up_to_Nth_term {
     public static int [] series(int n){
          int[] Series(int n) {
               // code here
               int[] fibo=new int[n+1];
               fibo[0]=0;
               fibo[1]=1;
               for(int i=2;i<=n; i++){
                   fibo[i]=fibo[i-1]+fibo[i-2];
                   fibo[i]=fibo[i]%(int)(Math.pow(10,9)+7);
               }
               return fibo;
           }
     }

     public static void main(String[] args) {

     }
}
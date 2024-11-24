import java.util.*;

public class Row_with_minimum_number_of_1's{
     int minRow(int n, int m, int a[][]) {
          // code here
          int count = m;
          int res = 0;
          for(int i=0; i<n; i++){
              int c = 0;
              for(int b : a[i]){
                  c += b;
              }
              if(c < count){
                  count = c;
                  res = i;
              }
          }
          return res+1;
      }
  
     public static void main(String args[]){

     }
}
package June;
import java.util.*;
import java.util.*;
public class Convert_array_i_to_Zig_Zag_fashion{
     public static void zigZag(int n, int[] arr) {
          // code here
          for(int i=0; i<n-1; i++){
              if(i%2==0 && arr[i]>arr[i+1]){
                  int temp = arr[i];
                  arr[i] = arr[i+1];
                  arr[i+1] = temp;
              }
          
              else{
                  if(i%2==1 && arr[i]<arr[i+1]){
                     int temp = arr[i];
                     arr[i] = arr[i+1];
                     arr[i+1] = temp;
                      }
                   }
              }
          }
     public static void main(String args[]){

     }
}
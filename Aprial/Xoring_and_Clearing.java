import java.io.*;
import java.util.*;

public class Xoring_and_Clearing {
     public void printArr(int n, int arr[]) {
          // code here
          for (int i = 0; i < n; i++) {
               System.out.print(arr[i] + " ");
          }
          System.out.println();

     }

     public void setToZero(int n, int arr[]) {
          // code here
          for (int i = 0; i < n; i++) {
               arr[i] = 0;
          }
     }

     public void xor1ToN(int n, int arr[]) {
          // code here
          for (int i = 0; i < n; i++) {
               arr[i] = arr[i] ^ i;
          }
     }

     public static void main(String[] args) {

     }
}
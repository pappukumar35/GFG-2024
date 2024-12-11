package December;

import java.util.*;

public class Merge_Without_Extra_Space {
     public void mergeArrays(int a[], int b[]) {
          int[] merged = new int[a.length + b.length];
          System.arraycopy(a, 0, merged, 0, a.length);
          System.arraycopy(b, 0, merged, a.length, b.length);
          Arrays.sort(merged);
          for (int i = 0; i < a.length; i++) {
               a[i] = merged[i];
          }
          for (int i = 0; i < b.length; i++) {
               b[i] = merged[a.length + i];
          }
     }

     public static void main(String[] args) {

     }
}
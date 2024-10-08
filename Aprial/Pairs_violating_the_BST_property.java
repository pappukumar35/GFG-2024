package Aprial;

import java.io.*;
import java.util.*;

import org.w3c.dom.Node;

public class Pairs_violating_the_BST_property {
     static int k;

     public static int pairsViolatingBST(int n, Node root) {
          // code here

          k = 0;
          int arr[] = new int[n];
          inorder(root, arr);

          return countInversion(arr, 0, n - 1);

     }

     static void inorder(Node root, int arr[]) {
          if (root == null) {
               return;
          }

          inorder(root.left, arr);
          arr[k++] = root.data;
          inorder(root.right, arr);
     }

     static int countInversion(int arr[], int l, int r) {

          int res = 0;
          if (l < r) {
               int m = (l + r) / 2;
               // count inversion in left half
               res += countInversion(arr, l, m);
               // count inversion in right half.
               res += countInversion(arr, m + 1, r);
               // count inversion while merging left and right parts.
               res += countAndMerge(arr, l, m, r);
          }
          return res;
     }

     static int countAndMerge(int arr[], int l, int m, int r) {
          int n1 = m - l + 1;
          int n2 = r - m;
          int left[] = new int[n1];
          int right[] = new int[n2];

          for (int i = 0; i < n1; i++) {
               left[i] = arr[l + i];
          }
          for (int i = 0; i < n2; i++) {
               right[i] = arr[m + 1 + i];
          }

          int ans = 0, i = 0, j = 0, k = l;

          while (i < n1 && j < n2) {
               if (left[i] <= right[j]) {
                    arr[k] = left[i];
                    i++;
                    k++;
               }

               else {
                    arr[k] = right[j];
                    j++;
                    k++;
                    ans += (n1 - i);
               }
          }

          while (i < n1) {
               arr[k] = left[i];
               i++;
               k++;
          }
          while (i < n2) {
               arr[k] = right[j];
               j++;
               k++;
          }
          return ans;
     }

     public static void main(String[] args) {

     }
}

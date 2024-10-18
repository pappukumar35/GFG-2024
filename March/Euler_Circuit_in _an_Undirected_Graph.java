import java.io.*;
import java.util.*;

class Euler_Circuit_in_an_Undirected_Graph {
     public boolean isEularCircuitExist(int v, ArrayList<ArrayList<Integer>> adj) {
          int deg = 0;
          for (int i = 0; i < v; i++) {
               if (adj.get(i).size() % 2 == 0) {
                    deg++;
               }
          }
          if (deg == v) {
               return true;
          }
          return false;

     }

     public static void main(String[] args) {

     }

}
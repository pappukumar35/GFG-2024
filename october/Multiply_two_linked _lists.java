package october;

public class Multiply_two_linked_lists {
     long mod = 1000000007;

     public long multiplyTwoLists(Node first, Node second) {
          // Code here
          long f = getNum(first);
          long s = getNum(second);
          return (f * s) % mod;
     }

     private long getNum(Node node) {
          long res = 0;
          while (node != null) {
               res = ((res * 10) + node.data) % mod;
               node = node.next;
          }
          return res;
     }

     public static void main(String[] args) {

     }
}
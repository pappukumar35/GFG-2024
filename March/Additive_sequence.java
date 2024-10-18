class Additive_sequence {
     private boolean f(int starti, int endi, int startj, int endj, int startk, String s, int n) {
          // starti : starting index of first no.
          // endi : ending index of first no.
          // startj : starting index of second no.
          // endj : ending index of second no.
          // startk : starting index of third no.
          // endk can vary so as to accomodate to the size of the third no.(as the 3rd no.
          // can be quite large)

          if (startk == n)
               return true;
          if (starti == n || endi == n || startj == n || endj == n)
               return false;

          long a = 0, b = 0, c = 0; // since the nos. can be large
          for (int i = starti; i <= endi; i++)
               a = (10 * a) + (s.charAt(i) - '0');
          for (int i = startj; i <= endj; i++)
               b = (10 * b) + (s.charAt(i) - '0');
          for (int endk = startk; endk < n; endk++) {
               c = (10 * c) + (s.charAt(endk) - '0');
               if ((a + b) == c)
                    return f(startj, endj, startk, endk, endk + 1, s, n); // since the condition is satisfied, check for
                                                                          // further indices
          }

          return false;
     }

     public boolean isAdditiveSequence(String s) {
          // code here

          /*
           * Observation :-
           * for any no. : 13132639(say)
           * 
           * let i denote the ending point of the first no.(a) of the sequence, j denote
           * the ending point of
           * second no.(b) and k denote the ending point of the third no in the sequence,
           * then, a+b should be
           * equal to c
           * 
           * if the above mentioned condition is satisfied for any particular set of
           * indices {i,j}, it must follow for
           * the next set of indices till the no. finishes, thus, recursive call for
           * further indices(intuition behind recursion)
           * else, if the 3rd no. is smaller, let it increase
           * 
           * from the above example, it's clear that the above condition is satisfied for
           * starti=0, endi=1,
           * startj=2, endj=3, startk=4, endk=5
           * now check for the remaining indices recursively. For this checking, adjust
           * indices.
           * Obviously, through common sense :-
           * starti=startj, endi=endj, startj=startk, endj=endk, startk=endj+1
           */

          int n = s.length();
          for (int i = 0; i < n - 2; i++) {
               for (int j = i + 1; j < n - 1; j++) {
                    if (f(0, i, i + 1, j, j + 1, s, n))
                         return true;
               }
          }
          return false;
     }

     public static void main(String[] args) {

     }
}
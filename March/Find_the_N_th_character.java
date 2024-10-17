class Find_the_N_th_character {
     public char nthCharacter(String s, int r, int n) {
          int growth = (int) Math.pow(2, r);

          int blockNo = n / growth;
          int index = n % growth;

          char root = s.charAt(blockNo);
          Queue<Character> q = new LinkedList<>();
          q.add(root);

          while (r > 0) {

               int size = q.size();
               ArrayList<Character> temp = new ArrayList<>();

               for (int i = 0; i < size; i++) {
                    if (q.poll() == '1') {
                         temp.add('1');
                         temp.add('0');
                    } else {
                         temp.add('0');
                         temp.add('1');
                    }

                    if (temp.size() >= index + 1)
                         break;
               }

               q = new LinkedList<>();
               for (char e : temp) {
                    q.add(e);
               }

               r--;

          }

          while (index > 0) {
               q.poll();
               index--;
          }

          return q.poll();
     }
}
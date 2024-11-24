import java.util.ArrayList;
import java.util.HashSet;

public class Recamans_sequence {
          static ArrayList<Integer> recamanSequence(int n) {
                    // code here
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(0);
                    HashSet<Integer> set = new HashSet<>();
                    set.add(0);
                    for (int i = 1; i <= n; i++) {
                              int val = list.get(i - 1) - i;
                              if (val < 0 || set.contains(val)) {
                                        val = list.get(i - 1) + i;
                              }
                              list.add(val);
                              set.add(val);
                    }
                    return list;
          }

}

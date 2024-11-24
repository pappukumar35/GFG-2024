import java.util.ArrayList;
import java.util.HashSet;

class Panagram_Checking {
    public static boolean checkPangram(String s) {
        // your code here
        HashSet<Character> hs1 = new HashSet<>();
        ArrayList<Character> al = new ArrayList<>();

        String str = s.toLowerCase();

        for (char ch = 'a'; ch <= 'z'; ch++) {
            hs1.add(ch);
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            al.add(ch);
        }

        for (char ch : hs1) {
            if (!al.contains(ch)) {
                return false;
            }
        }

        return true;

    }
}
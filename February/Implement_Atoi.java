class Implement_Atoi {
    int atoi(String s) {
        // Your code here
        boolean flag = false;
        int res = 0;
        if (s.charAt(0) == '-')
            flag = true;
        for (int i = 0; i < s.length(); i++) {
            int ch = (int) s.charAt(i);
            if (ch >= 48 && ch <= 57) {
                res = res * 10 + (ch - 48);
            } else if (flag && i == 0)
                continue;
            else
                return -1;
        }
        if (flag) {
            res = -res;
            return res;
        } else
            return res;
    }
}
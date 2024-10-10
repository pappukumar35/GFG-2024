class Techfest_and_the_Queue {
    static long prime(long n) {
        long c = 0;
        while (n % 2 == 0) {
            c++;
            n /= 2;
        }
        for (int i = 3; i * i <= n; i++) {
            while (n % i == 0) {
                c++;
                n /= i;
            }
        }
        if (n > 2)
            c++;
        return c;
    }

    public static long sumOfPowers(long a, long b) {
        // code here\
        long res = 0;
        for (long i = a; i <= b; i++)
            res += prime(i);

        return res;
    }

}
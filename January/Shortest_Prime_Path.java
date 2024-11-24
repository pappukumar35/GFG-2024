class Shortest_Prime_Path {
    int solve(int num1, int num2) {
        // code here
        if (num1 == num2)
            return 0;
        boolean[] prime = new boolean[10000];
        Arrays.fill(prime, true);
        prime[1] = false;
        for (int i = 2; i <= 9999; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= 9999; j += i) {
                    prime[j] = false;
                }
            }
        }
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(num1, 0));
        boolean[] vis = new boolean[10000];
        while (!queue.isEmpty()) {
            int num = queue.peek().first;
            int step = queue.peek().second;
            queue.poll();
            if (num == num2)
                return step;
            if (vis[num])
                continue;
            vis[num] = true;
            String str = Integer.toString(num);
            for (int i = 0; i < 4; i++) {
                for (char j = '0'; j <= '9'; j++) {

                    if ((i == 0 && j == '0') || j == str.charAt(i))
                        continue;
                    else {
                        String newStr = str.substring(0, i) + j + str.substring(i + 1);
                        int val = Integer.valueOf(newStr);
                        if (prime[val])
                            queue.add(new Pair(val, step + 1));
                    }
                }
            }
        }
        return -1;
    }
}
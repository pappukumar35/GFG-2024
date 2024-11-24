class Smallest_window_containing_0_1_and_2 {
    public int smallestSubstring(String S) {
        int n = S.length();
        int[] count = new int[3]; // Count of characters 0, 1, and 2
        int start = 0;
        int end = 0;
        int minLength = Integer.MAX_VALUE;
        int foundCharacters = 0;

        while (end < n) {
            char currentChar = S.charAt(end);
            count[currentChar - '0']++;

            if (count[currentChar - '0'] == 1) {
                // New character found in the current window
                foundCharacters++;
            }

            // Try to minimize the window by moving the start pointer
            while (foundCharacters == 3) {
                minLength = Math.min(minLength, end - start + 1);

                char startChar = S.charAt(start);
                count[startChar - '0']--;

                if (count[startChar - '0'] == 0) {
                    // One of the required characters is no longer in the window
                    foundCharacters--;
                }

                start++;
            }

            end++;
        }

        return (minLength == Integer.MAX_VALUE) ? -1 : minLength;
    }
}
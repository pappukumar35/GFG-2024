class Insert_and_Search_in_a_Trie {
    static void insert(TrieNode root, String key) {
        TrieNode curr = root;
        for (int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);
            if (curr.children[c - 'a'] == null) {
                curr.children[c - 'a'] = new TrieNode();
            }
            curr = curr.children[c - 'a'];
        }
        curr.isEndOfWord = true;
    }

    // Function to use TRIE data structure and search the given string.
    static boolean search(TrieNode root, String key) {
        TrieNode curr = root;
        for (int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);
            if (curr.children[c - 'a'] == null) {
                return false;
            }
            curr = curr.children[c - 'a'];
        }
        return curr.isEndOfWord;
    }

}
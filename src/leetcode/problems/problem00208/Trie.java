package leetcode.problems.problem00208;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class TrieNode {

    private String prefixCharacter;
    private boolean isWord;
    private Map<String, TrieNode> children = new HashMap<>();
    private int depth;

    // Initialize your data structure here.
    public TrieNode(String prefixCharacter, int depth) {
        this.prefixCharacter = prefixCharacter;
        this.depth = depth;
    }

    public String getPrefixCharacter() {
        return prefixCharacter;
    }

    public boolean isWord() {
        return isWord;
    }

    public void setIsWord(boolean isWord) {
        this.isWord = isWord;
    }

    public boolean hasChild(char prefixCharacter) {
        return children.containsKey(String.valueOf(prefixCharacter));
    }

    public boolean hasChildren() {
        return !children.isEmpty();
    }

    public TrieNode getChild(char prefixCharacter) {
        return children.get(String.valueOf(prefixCharacter));
    }

    public void addChild(char character) {
        children.put(String.valueOf(character), new TrieNode(String.valueOf(character), depth + 1));
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder
            .append("[")
            .append("prefix: ").append(prefixCharacter)
            .append(", isWord: ").append(isWord)
            .append(", children: [");

        StringBuilder depthIndentationBuilder = new StringBuilder();
        IntStream.range(0, depth).forEach(i -> {
            depthIndentationBuilder.append("\t");
        });

        String childString = children.entrySet().stream()
            .map(entry -> String.format("\n%schildKey: %s, childNode: %s",
                depthIndentationBuilder.toString(), entry.getKey(), entry.getValue()))
            .collect(Collectors.joining(", "));

        builder.append(childString).append("]]");
        return builder.toString();
    }
}

public class Trie {

    private TrieNode root;

    public Trie() {
        root = new TrieNode("", 0);
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        if (word == null) {
            return;
        }

        TrieNode node = root;

        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);
            if (!node.hasChild(character)) {
                node.addChild(character);
            }
            node = node.getChild(character);
        }

        node.setIsWord(true);
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        TrieNode node = lookForNode(word);
        return (node != null && node.isWord());
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        TrieNode node = lookForNode(prefix);
        return (node == null || (!node.hasChildren() && !node.isWord()))
            ? false
            : true;
    }

    private TrieNode lookForNode(String prefix) {
        if (prefix == null) {
            return null;
        }

        TrieNode node = root;

        for (int i = 0; i < prefix.length(); i++) {
            if (!node.hasChildren()) {
                return null;
            } else if (!node.hasChild(prefix.charAt(i))) {
                return null;
            } else {
                node = node.getChild(prefix.charAt(i));
            }
        }

        return node;
    }

    @Override
    public String toString() {
        return root.toString();
    }
}

// Your Trie object will be instantiated and called as such:
// Trie trie = new Trie();
// trie.insert("somestring");
// trie.search("key");

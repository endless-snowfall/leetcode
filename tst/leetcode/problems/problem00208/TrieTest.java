package leetcode.problems.problem00208;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import leetcode.problems.common.TestBase;

public class TrieTest extends TestBase {

    private Trie trie;

    @Before
    public void before() {
        trie = new Trie();
    }

    @Test
    public void test1() {
        assertFalse(trie.search(null));
        assertFalse(trie.startsWith(null));
    }

    @Test
    public void test2() {
        assertFalse(trie.search(""));
        assertFalse(trie.startsWith(""));
    }

    @Test
    public void test3() {
        trie.insert("");
        assertTrue(trie.search(""));
        assertTrue(trie.startsWith(""));
    }

    @Test
    public void test4() {
        trie.insert("a");
        assertTrue(trie.search("a"));
        assertTrue(trie.startsWith("a"));
        assertTrue(trie.startsWith(""));
        assertFalse(trie.search("b"));
        assertFalse(trie.startsWith("b"));
    }

    @Test
    public void test5() {
        trie.insert("dog");
        assertTrue(trie.search("dog"));
        assertTrue(trie.startsWith("dog"));
        assertFalse(trie.search("cat"));
        assertFalse(trie.startsWith("cat"));
    }

    @Test
    public void test6() {
        trie.insert("dog");
        trie.insert("cat");
        assertTrue(trie.search("dog"));
        assertTrue(trie.startsWith("dog"));
        assertTrue(trie.search("cat"));
        assertTrue(trie.startsWith("cat"));
    }

    @Test
    public void test7() {
        trie.insert("apple");
        trie.insert("anthony");
        trie.insert("ant");

        assertTrue(trie.search("apple"));
        assertTrue(trie.search("anthony"));
        assertTrue(trie.search("ant"));
        assertFalse(trie.search("anth"));

        assertTrue(trie.startsWith(""));
        assertTrue(trie.startsWith("a"));
        assertTrue(trie.startsWith("an"));
        assertTrue(trie.startsWith("ant"));
        assertTrue(trie.startsWith("anth"));
        assertTrue(trie.startsWith("antho"));
        assertTrue(trie.startsWith("anthon"));
        assertTrue(trie.startsWith("anthony"));

        assertTrue(trie.startsWith("ap"));
        assertTrue(trie.startsWith("app"));
        assertTrue(trie.startsWith("appl"));
        assertTrue(trie.startsWith("apple"));

        assertFalse(trie.startsWith("ab"));
        assertFalse(trie.startsWith("anb"));
        assertFalse(trie.startsWith("antb"));
        assertFalse(trie.startsWith("anthb"));
        assertFalse(trie.startsWith("anthob"));
        assertFalse(trie.startsWith("anthonyb"));
    }
}

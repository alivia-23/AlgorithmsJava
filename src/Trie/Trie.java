package Trie;

import java.util.HashMap;
import java.util.Map;

public class Trie {
	
	class TrieNode {
		boolean isWord;
		Map<Character, TrieNode> childrenMap = new HashMap<>();
	}
	
	TrieNode root;
	
	public Trie() {
		root = new TrieNode();
	}
    
	/**
	 * Insert a word in trie
	 */
	public void insertWord(String word) {
		TrieNode cur = root;
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if (cur.childrenMap.get(c) == null) {
				cur.childrenMap.put(c, new TrieNode());
			}
			cur = cur.childrenMap.get(c);
		}
		cur.isWord = true;
	}
	
	/**
	 * Search a word in trie
	 */
	public boolean searchWord(String word) {
		TrieNode cur = root;
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if (cur.childrenMap.get(c) == null) {
				return false;
			}
			cur = cur.childrenMap.get(c);
		}
		return cur.isWord;
	}
	
	/**
	 * Search prefix of a word
	 */
	public boolean searchPrefix(String prefix) {
		TrieNode cur = root;
		for (int i = 0; i < prefix.length(); i++) {
			char c = prefix.charAt(i);
			if (cur.childrenMap.get(c) == null) {
				return false;
			}
			cur = cur.childrenMap.get(c);
		}
		return true;
		
	}
}

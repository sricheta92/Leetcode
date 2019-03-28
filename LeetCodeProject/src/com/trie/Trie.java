package com.trie;

import java.util.HashMap;
import java.util.Map;

public class Trie {
	
	private class TrieNode{
		
		boolean endOfWord;
		Map<Character, TrieNode> children;
		
		public TrieNode(){
			children = new HashMap<Character, TrieNode>();
			endOfWord = false;
		}
		
	}
	
	TrieNode root;
	
	public Trie() {
		root = new TrieNode();
	}
	
	public void insert(String word) {
		
		TrieNode current = root;
		char[] arr = word.toCharArray();
		
		for(int i =0;i<arr.length;i++) {
			TrieNode node = current.children.get(arr[i]);
			if(node == null) {
				node = new TrieNode();		
				current.children.put(arr[i], node);
			}
			current = node;
		}
		
		current.endOfWord = true;
				
		
	}
	
	public boolean search(String word) {
		TrieNode current = root;
		char[] arr = word.toCharArray();
		for(int i =0;i<arr.length;i++) {
			
			TrieNode node = current.children.get(arr[i]);
			if(node == null) {
				return false;
			}
			current = node;
		}
		
		return current.endOfWord;
	}

	public boolean startsWith(String word) {
		TrieNode current = root;
		char[] arr = word.toCharArray();
		for(int i =0;i<arr.length;i++) {
			
			TrieNode node = current.children.get(arr[i]);
			if(node == null) {
				return false;
			}
			current = node;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Trie t = new Trie();
		t.insert("Sricheta");
		t.insert("Sri");
		t.walkTrie();
		System.out.println(t.startsWith("Sri"));
	}

	private void walkTrie() {
		TrieNode curr = root;
		
		if(curr.)
		
	}
}

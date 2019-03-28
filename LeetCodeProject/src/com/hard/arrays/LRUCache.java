package com.hard.arrays;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LRUCache {

	Deque<Integer> queue = null;
	Map<Integer,Integer> map= null;
	int max_capacity;
	int size;
	public LRUCache(int capacity) {
		this.max_capacity = capacity;
		queue = new LinkedList<Integer>();
		map = new HashMap<Integer, Integer>();
		size = 0;
	}

	public static void main(String[] args) {
		//LRUCache cache = new LRUCache(2);

		LRUCache cache = new LRUCache( 2 /* capacity */ );
		//cache.get(2);   
		cache.put(2, 1);
		cache.put(1, 1);       // returns 1
		cache.put(2, 3);    // evicts key 2
		cache.put(4, 1);       // returns -1 (not found)
		cache.get(1);    // evicts key 1
		cache.get(2);       // returns -1 (not found)
	}


	public int get(int key) {

		if(map.get(key)!=null) {
			queue.remove(key);
			queue.addFirst(key);
			return map.get(key);

		}else {
			return -1;
		}

	}



	public void put(int key, int value) {
		
		 if (map.containsKey(key)) {
             queue.remove(Integer.valueOf(key));
             queue.addFirst(key);
         } else if (queue.size() >= this.max_capacity){
             int evicted = queue.removeLast();
             map.remove(evicted);
             queue.addFirst(key);
         } else {
             queue.addFirst(key);
         }
         map.put(key, value);
	}
}


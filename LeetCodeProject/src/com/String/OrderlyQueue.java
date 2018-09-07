package com.String;

import java.util.LinkedList;
import java.util.Queue;

public class OrderlyQueue {

	public static void main(String[] args) {
		orderlyQueue("baaca", 1)
	}
	
	 public static String orderlyQueue(String S, int K) {
	        
		 Queue<Character> q = new LinkedList<Character>();
		 for(char a : S.toCharArray()) {
			 q.add(a);
		 }
		 
		 int i =0;
		 while(i<K) {
			 q.poll()
		 }
	        
	 }
}

package com.easy.stack;

import java.util.Iterator;
import java.util.Stack;

public class SortStack {
	
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(34);
		s.push(3);
		s.push(31);
		s.push(98);
		s.push(92);
		s.push(23);
		printStack(s);
		System.out.println();
		//Stack<Integer> s1 = sortStack(s);
		sortStackRecursion(s);
		printStack(s);
	}

	private static void  sortStackRecursion(Stack<Integer> s) {
		if(!s.isEmpty()) {
			int x = s.peek();
			s.pop();
			sortStackRecursion(s);
			sortedInsert(x,s);
		}
	}

	private static void sortedInsert(int x, Stack<Integer> s) {
		if(s.isEmpty() || x> s.peek()) {
			s.push(x);
		}else {
			int temp = s.peek();
			s.pop();
			sortedInsert(x, s);
			s.push(temp);
		}
		
	}

	private static void printStack(Stack<Integer> s) {
		Iterator<Integer> i = s.iterator();
		
		while(i.hasNext()) {
			System.out.print(i.next() + " ");
		}
		
	}

	private static Stack<Integer> sortStack(Stack<Integer> s) {
		Stack<Integer> res = new Stack<Integer>();
		while(!s.isEmpty()) {
			int temp = s.pop();
			while(!res.isEmpty() && res.peek() > temp) {
				s.push(res.pop());
			}
			res.add(temp);
		}
		return res;
	}

}

package com.easy.queue;

import java.util.Stack;

public class StackDemo {
	
	private static int SIZE = 10;
	private Stack<Integer> stack;
	
	public StackDemo(Stack<Integer> stack) {
		this.stack = stack;
	}
	
	public  int pop() {
		return stack.pop();
		
	}

	public  int top() {
		return stack.peek();
		
	}

	public  Stack<Integer> prepareStack() {
		stack.add(3);
		stack.add(5);
		stack.add(6);
		stack.add(7);
		stack.add(9);
		return stack;
		
	}

}

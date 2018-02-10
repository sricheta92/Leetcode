package com.easy.stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {

	private int capacity;
	private Queue<Integer> q1 = null;
	private Queue<Integer> q2= null;
	private int top;


	public StackUsingQueues(int i) {
		this.capacity = i;
		q1 = new LinkedList<Integer>();
		q2 = new LinkedList<Integer>();
		top = -1;
	}


	public static void main(String[] args) throws Exception {

		StackUsingQueues s = new StackUsingQueues(5);
		s.push(2);
		s.push(3);
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());

	}

	private void push(int i) {

		if(top+1 == capacity) {
			try {
				throw new Exception("Stack Overflow");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			q1.add(i);
			top++;
		}
	}

	private int pop() throws Exception {

		if(top == -1) {
			try {
				throw new Exception("Stack empty");
			
			} catch (Exception e) {
				throw e;
			}
		
		}
			while(q1.size() !=1) {
				q2.add(q1.remove());
			}
			top--;
			int elem = q1.remove();
			Queue<Integer> temp = q1;
			q1 = q2;
			q2 = temp;
			
			return elem;
		
		
	}
}

package com.easy.queue;

import java.util.Queue;

public class QueueDemo {
	
	private static int SIZE = 10;
	private Queue<Integer> queue;
	
	public QueueDemo(Queue<Integer> queue) {
		this.queue = queue;
	}
	
	public  int deQueue() {
		return queue.poll();
		
	}

	public  int seeFront() {
		return queue.peek();
		
	}

	public  Queue<Integer> makeQueue() {
		queue.add(3);
		queue.add(5);
		queue.add(6);
		queue.add(7);
		queue.add(9);
		return queue;
		
	}

}

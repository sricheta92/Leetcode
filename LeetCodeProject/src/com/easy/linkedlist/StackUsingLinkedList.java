package com.easy.linkedlist;

/** 
 * Insert the node to  a head of linklist everytime = STACK
 * @author Sricheta's computer
 *
 */
public class StackUsingLinkedList {
	
	static class ListNode{
		ListNode next;
		int data;
	}
	
	ListNode top;
	
	public void push(int a) {
		ListNode node = new ListNode();
		node.data = a;
		node.next = top;
		top = node;
		
	}
	
	public int pop() throws Exception {
		if(top!= null) {
			top = top.next;
			return top.data;
		}else {
			throw new Exception("Empty Stack!");
		}
		
		
	}
	
	public int top() throws Exception {
		if(top!= null) {
			return top.data;
		}else {
			throw new Exception("Empty Stack!");
		}
	}
}

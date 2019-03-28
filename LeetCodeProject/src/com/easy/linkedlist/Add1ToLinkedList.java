package com.easy.linkedlist;

import java.nio.charset.MalformedInputException;

public class Add1ToLinkedList {
	
	
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.setNext(new ListNode(1));
		l1.getNext().setNext(new ListNode(3));
		add1(l1);
		LinkedList l = new LinkedList(); 
		l.setHead(l1);
		l.printList();
	}

	private static void add1(ListNode head) {
			
	}
}

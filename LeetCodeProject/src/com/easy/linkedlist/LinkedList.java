package com.easy.linkedlist;

public class LinkedList {
	
	private ListNode head;
	public ListNode getHead() {
		return head;
	}

	public void setHead(ListNode head) {
		this.head = head;
	}

	private int size;
	
	LinkedList(){
		head = null;
		size = 0;
	}
	
	public void insertAtBegininng(int data) {
		
		ListNode n = new ListNode(data);
		
		if(head == null) {
			n.setNext(null);
			head = n;
		}else {
			n.setNext(head);
		}
		head = n;
		size++;
	}
	
	public void insertAtEnd(int data) {
		
		ListNode n = new ListNode(data);
		ListNode curr = head;
		while(curr!=null &&curr.getNext()!=null) {
			curr= curr.getNext();
		}
		if(head == null) {
		head =n;
		}else {
		curr.setNext(n);
		}
		n.setNext(null);
		size++;
	}
	
	public void printList() {
		
		ListNode curr = head;
		while(curr!=null) {
			System.out.print(curr.getData() + "->");
			curr = curr.getNext();
		}
	}

	public int getSize() {
		return this.size;
	}

	public ListNode reverse() {
		ListNode curr = head;
		ListNode prev = null;
		while(curr!=null ) {
			ListNode next = curr.getNext();
			curr.setNext(prev);
			prev  = curr;
			curr = next;
		}
		head = prev;
		return prev;
	}
}

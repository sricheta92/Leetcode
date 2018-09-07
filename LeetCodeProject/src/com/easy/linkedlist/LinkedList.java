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
	
	public LinkedList(){
		head = null;
		size = 0;
	}
	
	public void insertAtBegininng(int data) {
		
		ListNode n = new ListNode(data);
		n.setNext(head);
		head = n;
		size++;
	}
	
	
	public void insertAtEnd(int data) {
		ListNode curr = head;
		while(curr.getNext()!=null) {
			curr = curr.getNext();
		}
		ListNode n = new ListNode(data);
		n.setNext(null);
		curr.setNext(n);
		size++;
	}
	
	public void insertAtMiddle(int data, int position) {
		int count =0;
		ListNode curr = head;
		while(count!=position) {
			curr= curr.getNext();
			count++;
		}
		ListNode n= new ListNode(data);
		ListNode next = curr.getNext();
		curr.setNext(n);
		n.setNext(next);
	}
	
	public void deleteAtBeginning() {
		if(head !=null) {
			head = head.getNext();
		}
	}
	
	public void deleteAtEnd() {
		ListNode curr = head;
		if(curr.getNext()==null) {
			curr=null;
		}
		while(curr.getNext().getNext()!=null) {
			curr= curr.getNext();
		}
		curr.setNext(null);
	}
	
	public void printList() {
		
		Integer.bitCount(3);
		
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
	
	public void recursiveReverse(ListNode p) {
		
		if(p.next == null) {
			head = p;
			return;
		}
		recursiveReverse(p.next);
		ListNode q = p.next;
		q.next = p;
		p.next = null;
		
		printList();
	}
}

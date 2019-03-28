package com.medium.trees;

public class MultiLevelLinkedList {

	static Node  node = null;
	public static void main(String[] args) {
		// Creating above example list 
		Node head = new Node(1); 
		head.next = new Node(2); 
		head.next.next = new Node(3); 
		head.next.next.next = new Node(4); 
		head.next.child = new Node(7); 
		head.next.child.child = new Node(9); 
		head.next.child.child.child = new Node(14); 
		head.next.child.child.child.child 
		= new Node(15); 
		head.next.child.child.child.child.next 
		= new Node(23); 
		head.next.child.child.child.child.next.child 
		= new Node(24); 
		head.next.child.next = new Node(8); 
		head.next.child.next.child = new Node(16); 
		head.next.child.next.child.child = new Node(17); 
		head.next.child.next.child.child.next 
		= new Node(18); 
		head.next.child.next.child.child.next.next 
		= new Node(19); 
		head.next.child.next.child.child.next.next.next 
		= new Node(20); 
		head.next.child.next.child.child.next.next.next.child 
		= new Node(21); 
		head.next.child.next.next = new Node(10); 
		head.next.child.next.next.child = new Node(11); 

		head.next.child.next.next.next = new Node(12); 

		// Flatten list and print modified list 
		flattenList(head); 
		

	}

	private static void flattenList(Node head) {
		Node curr = head;
		while(curr!=null) {
			if(node == null) {
				node = curr;
			}else {
				node.next  = curr;
			}
			System.out.println(curr.val);
			if(curr.child!=null) {
				flattenListDown(curr.child);
			}
			curr = curr.next;
		}
	}

	private static void flattenListDown(Node head) {
		if(head == null) {
			return;
		}
		node.next = head;
		if(head.next == null && head.child == null) {
			return;
		}
	
		if(head.child != null) {
			flattenListDown(head.child);
		}
		if(head.next != null) {
			flattenListDown(head.next);
		}
	}
}


class Node {
	public int val;
	public Node prev;
	public Node next;
	public Node child;

	public Node(int data){
		this.val = data;
	}

	public Node(int _val,Node _prev,Node _next,Node _child) {
		val = _val;
		prev = _prev;
		next = _next;
		child = _child;
	}
};
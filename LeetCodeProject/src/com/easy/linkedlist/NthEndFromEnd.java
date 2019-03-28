package com.easy.linkedlist;

public class NthEndFromEnd {
	
	static int i =0;
	public static void main(String[] args) throws Exception {
		
		ListNode l1 = new ListNode(1);
		l1.setNext(new ListNode(2));
		l1.getNext().setNext(new ListNode(3));
		l1.next.next.next =new ListNode(4);
		//findNthNodeFromEnd(l1, 2);
		findNthNodeFromEnd2Pointers(l1,2);
	}

	private static void findNthNodeFromEnd2Pointers(ListNode head , int j) throws Exception {
		ListNode p1 = head;
		ListNode p2 = head;
		
		int count=0;
		while(count!= j && p1!=null) {
			p1= p1.next;
			count++;
			
		}
		
		if(p1==null) {
			throw new Exception("Invalid input");
		}
		
		while(p1!=null) {
			p1 = p1.next;
			p2 = p2.next;
		}
		
		System.out.println(p2.getData());
		
	}

	private static void findNthNodeFromEnd(ListNode head, int n ) {
		if(head == null) {
			return;
		}
		
		findNthNodeFromEnd( head.next,n);
		if(++i == n) {
			System.out.println(head.getData());
		}
	}

}

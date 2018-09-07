package com.easy.linkedlist;

public class DetectCycle {

	public static boolean hasCycle(ListNode head) {

		ListNode curr = head;
		ListNode slow = head;
		ListNode fast = head;
		while(fast!= null &&  fast.getNext()!=null){
			slow = slow.getNext();
			fast = fast.getNext().getNext();
			if(slow == fast){
				System.out.println(true);
				return true;
				
			}
		}
		System.out.println(false);
		return false;
	}
	
	public static void main(String[] args) {
		
		LinkedList llist =new LinkedList();
		llist.setHead(new ListNode(22));
		 llist.insertAtEnd(20);
	        llist.insertAtEnd(4);
	        llist.insertAtEnd(15);
	        llist.insertAtEnd(10);
	        
	        /*Create loop for testing */
	        llist.getHead().getNext().getNext().getNext().setNext(llist.getHead()); 
	        hasCycle(llist.getHead());
	}
}

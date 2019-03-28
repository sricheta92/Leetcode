package com.easy.linkedlist;

public class RemoveDuplicatesFromSortedList {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.setNext(new ListNode(1));
		l1.getNext().setNext(new ListNode(3));
		l1.next.next.next =new ListNode(3);
		

		removeDuplicatedFromSortedListUsingSet(l1);
		LinkedList l = new LinkedList(); 
		l.setHead(l1);
		l.printList();
	
	}
	
	/**
	 * O(N)
	 * @param head
	 */
	private static void removeDuplicatedFromSortedListUsingSet(ListNode head) {
		if(head == null) {
			return;
		}
		ListNode curr = head;
		while(curr!=null && curr.next!=null) {
			if(curr.getData() == curr.next.getData()) {
				curr.next = curr.next.next;
			}else {
				curr = curr.next;
			}
		}
		
		
	}
}

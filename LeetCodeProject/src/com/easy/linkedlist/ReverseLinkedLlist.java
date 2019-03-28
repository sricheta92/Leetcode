package com.easy.linkedlist;

public class ReverseLinkedLlist {
	
	static ListNode head = null;;
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insertAtBegininng(1);
		list.insertAtBegininng(2);
		list.insertAtBegininng(3);
		//ListNode l1 = new ListNode(1);
		//l1.setNext(new ListNode(2));
		//l1.getNext().setNext(new ListNode(2));
		//l1.next.next.next =new ListNode(3);
		list.printList();
		head= list.getHead();
		System.out.println();
		System.out.println(head.getData()+"jkjk");
	//	list.setHead(l1);
		reverse(head, null);
		list.setHead(head);
		list.printList();
		
	}

	private static ListNode reverse(ListNode curr, ListNode prev) {
		
		if(curr.next == null) {
			head = curr;
			curr.next = prev;
			return head;
		}
		
		ListNode next = curr.next;
		curr.next = prev;
		reverse(next, curr);
		return head;
	}

}

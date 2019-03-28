package com.medium.linkedlist;

import com.easy.linkedlist.LinkedList;
import com.easy.linkedlist.ListNode;

public class SwapPairWiseLinkedList {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insertAtBegininng(4);
		list.insertAtBegininng(3);
		list.insertAtBegininng(2);
		list.insertAtBegininng(1);
		ListNode res = swapPairWise(list.getHead());
		list.setHead(res);
		list.printList();
		
	}


	
	private static ListNode swapPairWise(ListNode node) {
		
		ListNode dummy = new ListNode(0);
		dummy.next = node;
		ListNode curr = dummy;
		
		while(curr.next!=null && curr.next.next!=null) {
			ListNode first = curr.next;
			ListNode second = curr.next.next;
			first.next = second.next;
			curr.next = second;
			curr.next.next = first;
			curr = curr.next.next;
		}
		
		return dummy.next;
	}
}

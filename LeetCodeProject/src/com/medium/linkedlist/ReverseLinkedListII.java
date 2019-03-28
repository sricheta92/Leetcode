package com.medium.linkedlist;

import com.easy.linkedlist.LinkedList;
import com.easy.linkedlist.ListNode;

public class ReverseLinkedListII {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insertAtBegininng(5);
		list.insertAtBegininng(4);
		list.insertAtBegininng(3);
		list.insertAtBegininng(2);
		list.insertAtBegininng(1);
		reverseBetween(list.getHead(), 2,4);
	}

	private static ListNode reverseBetween(ListNode head, int m, int n) {
		if( head == null) {
			return null;
		}
		
		ListNode dummy  = new ListNode(0);
		dummy.next = head;
		ListNode pre = dummy;

		for(int i =0;i<m-1;i++) {
			pre = pre.next;
		}
		ListNode start = pre.next;
		ListNode then = start.next;
		
		for(int i =0;i< n-m;i++) {
			start.next = then.next;
			then.next = pre.next;
			pre.next = then;
			then = start.next;
			
		}
		
		return dummy.next;

	}

}

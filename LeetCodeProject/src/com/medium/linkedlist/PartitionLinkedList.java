package com.medium.linkedlist;

import static org.junit.Assert.assertNotEquals;

import com.easy.linkedlist.LinkedList;
import com.easy.linkedlist.ListNode;

public class PartitionLinkedList {

	public static void main(String[] args) {

		LinkedList llist =new LinkedList();
		llist.setHead(new ListNode(3));
		llist.insertAtEnd(2);
	    llist.insertAtEnd(5);
	    llist.insertAtEnd(2);
	    llist.insertAtEnd(3);
	    llist.insertAtEnd(4);
	    llist.insertAtEnd(1);
	    llist.printList();
	    System.out.println();
	    ListNode res = partionAround(llist.getHead(),3);
	    LinkedList llist1 =new LinkedList();
		llist1.setHead(res);
		llist1.printList();
	    
	}

	private static ListNode  partionAround(ListNode head, int i) {
		
		ListNode smallHead=null,smallLast = null;
		ListNode equalHead =null,equalLast = null;
		ListNode greaterHead=null,greaterLast = null;
		
		while(head != null) {
			
			if(head.getData() == i) {
				if(equalHead== null) {
					equalHead = head;
					equalLast = head;
				}else {
					equalLast.next = head;
					equalLast = equalLast.next;
				}
			}
			if(head.getData()< i) {
				if(smallHead== null) {
					smallHead = head;
					smallLast = head;
				}else {
					smallLast.next = head;
					smallLast = head;
				}
			}
			if(head.getData()> i) {
				if(greaterHead== null) {
					greaterHead = head;
					greaterLast = head;
				}else {
					greaterLast.next = head;
					greaterLast = head;
				}
			}
			head = head.next;
		}
		// If greater list is not empty
		if(greaterLast!=null) {
			greaterLast.next = null;
		}
		// if small list is not empty
		if(smallLast!=null) {
			if(equalLast!=null) {
				smallLast.next = equalHead;
				if(greaterLast!=null) {
					equalLast.next = greaterHead;
				}else {
					equalLast.next = null;
				}
			}
			else {
				smallLast.next = greaterHead;
			}
			return smallHead;
		}else {
			if(equalLast!=null) {
				equalLast.next = greaterHead;
				return equalHead;
			}
			else {
				return greaterHead;
			}
		}
		
	}
	
}

package com.medium.linkedlist;

import com.easy.linkedlist.LinkedList;
import com.easy.linkedlist.ListNode;

public class RotateRight {
	public static void main(String[] args) {
		LinkedList llist =new LinkedList();
		llist.setHead(new ListNode(1));
		llist.insertAtEnd(2);
	  //  llist.insertAtEnd(3);
	   // llist.insertAtEnd(4);
	   // llist.insertAtEnd(5);
	    ListNode l = rotateLeft(llist.getHead(),1);
	    LinkedList llist1 =new LinkedList();
	    llist1.setHead(l);
	    llist1.printList();
	}

	private static ListNode rotateLeft(ListNode head, int d) {
		
		// 1 2 3 4 5
		
		// 5 1 2 3 4
		
		// 4 5 1 2 3
		int n =getLength(head);
		d = d%n;
		ListNode curr= head; 
		int i =0;
		//d = n-d;
		while(i <d   && curr!=null) {
			curr = curr.next;
			i++;
		}
		
		if(curr == null) {
			return head;
		}
		
		ListNode kthNode = curr;
		while(curr.next!=null) {
			curr = curr.next;
		}
		
		curr.next = head;
		head =  kthNode.next;
		kthNode.next = null;
		
		return head;
		
		
	}

	private static int getLength(ListNode head) {
		
		int count = 0;
		while(head !=null) {
			count++;
			head = head.next;
		}
		return count;
		
	}
}

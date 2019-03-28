package com.medium.linkedlist;

import com.easy.linkedlist.LinkedList;
import com.easy.linkedlist.ListNode;

public class DetectNodeAtLoop {
	
	public static void main(String[] args) {
		LinkedList llist =new LinkedList();
		llist.setHead(new ListNode(1));
		llist.insertAtEnd(2);
	    llist.insertAtEnd(3);
	    llist.insertAtEnd(4);
	    llist.insertAtEnd(5);
	    llist.insertAtEnd(3);
	}
	
	

}

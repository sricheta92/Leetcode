package com.medium.linkedlist;

import com.easy.linkedlist.LinkedList;
import com.easy.linkedlist.ListNode;

public class RotateLeft {


	public static void main(String[] args) {
		
		LinkedList llist =new LinkedList();
		llist.setHead(new ListNode(1));
		llist.insertAtEnd(2);
	   llist.insertAtEnd(3);
	   llist.insertAtEnd(4);
	   llist.insertAtEnd(5);
	    
	       int count =llist.getSize();
	       
	        if(llist!=null) {
	    		ListNode node =  rotateRight(llist.getHead(), 2) ;
			
	    	
	    		
	    		LinkedList llist1 =new LinkedList();
	    		llist1.setHead(node);
	    		llist1.printList();
	        }
	       
	}

	private static ListNode rotateRight(ListNode head, int d) {
		
		int length =0;
		ListNode curr = head;
		
		while(curr!=null) {
			length++;
			curr = curr.getNext();
		}
		
		int k = length - d-1;
		int count =1;
		ListNode curr1 = head;
		while(count<k && curr1!=null) {
			curr1 = curr1.getNext();
			count++;
		}
		
		   if (curr1 == null) {
			   return head;
		   }
	           
	 
		
		ListNode kthNode = curr1;
		
		while(curr1.getNext()!=null) {
			curr1 = curr1.getNext();
		}
		
		curr1.setNext(head);
		
		head = kthNode.getNext();
		kthNode.setNext(null);
		
		return head;
		
	}
	

	
}

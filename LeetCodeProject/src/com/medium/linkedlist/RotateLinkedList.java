package com.medium.linkedlist;

import com.easy.linkedlist.LinkedList;
import com.easy.linkedlist.ListNode;

public class RotateLinkedList {

	public static void main(String[] args) {
		
		LinkedList llist =new LinkedList();
		llist.setHead(new ListNode(1));
		 llist.insertAtEnd(2);
	        llist.insertAtEnd(3);
	        llist.insertAtEnd(4);
	       llist.insertAtEnd(5);
	    //   llist.insertAtEnd(2);
	    	//for(int i =0;i<2;i++) {
	       int count =llist.getSize();
	       
	        if(llist!=null) {
	    		ListNode node =  rotateRight(llist.getHead(), 0
	    				, 29898 % count);
		//	}
	    	
	    		
	    		LinkedList llist1 =new LinkedList();
	    		llist1.setHead(node);
	    		llist1.printList();
	        }
	       
	}

	private static ListNode rotateRight(ListNode head,int d, int count) {
		
		if(d ==count) {
			return head;
		}
	
		ListNode curr = head;
		while(curr.getNext()!=null) {
			curr = curr.getNext();
		}
		int temp =  curr.getData();
		ListNode res = new ListNode(temp);
		
		ListNode curr1 = head;

		res.setNext(curr1);
		if(curr1.getNext()==null) {
			curr1=null;
		}else {
			while(curr1.getNext().getNext()!=null) {
				curr1= curr1.getNext();
			}
			curr1.setNext(null);
		}
	
		
		head = res;
		return rotateRight(head,d+1,count);
	}
}

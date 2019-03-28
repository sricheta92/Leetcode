package com.medium.linkedlist;

import com.easy.linkedlist.LinkedList;
import com.easy.linkedlist.ListNode;

/**
 * Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
 *  preserve the original relative order of the nodes in each of the two partitions.
 * @author Sricheta's computer
 *
 */
public class PartitionLinkedListCTCI {
	
	public static void main(String[] args) {
		/*ListNode l1 = new ListNode(1);
		l1.setNext(new ListNode(5));
		l1.getNext().setNext(new ListNode(3));
		l1.next.next.next =new ListNode(4);
		
		
		
		LinkedList list = new LinkedList();
		list.setHead(partition(l1, 3));
		list.printList();*/
		
		LinkedList llist =new LinkedList();
		llist.setHead(new ListNode(3));
		llist.insertAtEnd(2);
	    llist.insertAtEnd(5);
	    llist.insertAtEnd(2);
	    llist.insertAtEnd(6);
	    llist.insertAtEnd(4);
	    llist.insertAtEnd(1);
	    llist.printList();
	    System.out.println();
	    ListNode res = partition(llist.getHead(),3);
	    LinkedList llist1 =new LinkedList();
		llist1.setHead(res);
		llist1.printList();
	}

	private static ListNode partition(ListNode l1, int x) {
		
		ListNode curr = l1;
		ListNode small = new ListNode(-1);
		ListNode small1 = small;
		ListNode big = new ListNode(-1);
		ListNode big1 = big;
		while(curr!=null) {
			
			if(curr.getData() <x) {
				small.next = new ListNode(curr.getData());
				small = small.next;
			}else {
				big.next = new ListNode(curr.getData());
				big = big.next;
			}
			curr = curr.next;
		}
		
		small.next = big1.next;
		return small1.next;
	}

}

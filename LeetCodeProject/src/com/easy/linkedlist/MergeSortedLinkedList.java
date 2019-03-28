    package com.easy.linkedlist;

import static org.junit.Assume.assumeNoException;

public class MergeSortedLinkedList {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.setNext(new ListNode(2));
		l1.getNext().setNext(new ListNode(5));


		ListNode l2 = new ListNode(3);
		l2.setNext(new ListNode(4));
		l2.getNext().setNext(new ListNode(6));
		LinkedList list = new LinkedList();
		//	list.setHead(recursiveMergeLinkedList(l1,l2));
		//list.printList();
		list.setHead(iterativeMergeLinkedList(l1,l2));
		list.printList();
	}	

	private static ListNode iterativeMergeLinkedList(ListNode list1, ListNode list2) {

		if(list1 == null) {
			return list2;
		}

		if(list2 == null) {
			return list1;
		}

		ListNode res = new ListNode(-1);
		ListNode res1 = res;
		while(list1!=null && list2!= null) {
			if(list1.getData()<list2.getData()) {
				res.next = list1;
				list1 = list1.next;
			}else {
				res.next = list2;
				list2 = list2.next;
			}
			res = res.next;
		}
		
		if(list1 == null) {
			res.next = list2;
		}else{
			res.next = list1;	
		}
		return res1.next;
	}

	/**
	 * O(N)
	 * @param list1
	 * @param list2
	 * @return
	 */
	private static ListNode recursiveMergeLinkedList(ListNode list1, ListNode list2) {

		if(list1 == null) {
			return list2;
		}

		if(list2 == null) {
			return list1;
		}

		ListNode res = null;
		if(list1.getData() < list2.getData()) {
			res = list1;	
			res.next = recursiveMergeLinkedList(list1.next, list2);
		}else {
			res = list2;
			res.next= recursiveMergeLinkedList(list1, list2.next);
		}

		return res;
	}
}

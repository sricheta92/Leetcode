package com.easy.linkedlist;

public class MergeSortedLinkedList {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.setNext(new ListNode(2));
		l1.getNext().setNext(new ListNode(5));
		
		
		ListNode l2 = new ListNode(3);
		l2.setNext(new ListNode(4));
		l2.getNext().setNext(new ListNode(6));
		LinkedList list = new LinkedList();
		list.setHead(mergeLinkedList(l1,l2));
		list.printList();
		
	}	

	private static ListNode mergeLinkedList(ListNode list1, ListNode list2) {
		
		ListNode result = null;
		if(list1== null && list2== null) {
			return null;
		}
		
		if(list1 == null) {
			return list2;
		}
		if(list2 == null) {
			return list1;
		}
		
		if(list1.getData()<=list2.getData()) {
			result = list1;
			result.setNext(mergeLinkedList(list1.getNext(),list2));
		}else {
			result = list2;
			result.setNext(mergeLinkedList(list1,list2.getNext()));
		}
		return result;
	}
}

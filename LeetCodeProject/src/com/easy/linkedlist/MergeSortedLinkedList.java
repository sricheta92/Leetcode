package com.easy.linkedlist;

public class MergeSortedLinkedList {

	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		list1.insertAtBegininng(3);
		list1.insertAtBegininng(2);
		//list1.printList();
		
		list1.reverse();
		
		list1.printList();
		
		/*System.out.println(" ");
		LinkedList list2 = new LinkedList();
		list2.insertAtBegininng(5);
		list2.insertAtBegininng(4);
		list2.printList();
		mergeLinkedList(list1,list2);*/
	}	qwe

	private static LinkedList mergeLinkedList(LinkedList list1, LinkedList list2) {
		
		LinkedList res = new LinkedList();
		
		if(list1 == null) {return list2};
		
	}
}

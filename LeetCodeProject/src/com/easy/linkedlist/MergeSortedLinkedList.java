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
	}

	private static void mergeLinkedList(LinkedList list1, LinkedList list2) {
		
		int i=0,j=0;
		int n1 = list1.getSize();
		int n2 = list2.getSize();
		LinkedList list3 = new LinkedList();
		while(i<n1 && j<n2) {
			//list3.insertAtEnd(data);
		}
		
	}
}

package com.easy.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatedFromUnsortedList {

	public static void main(String[] args) {
		
		ListNode l1 = new ListNode(1);
		l1.setNext(new ListNode(2));
		l1.getNext().setNext(new ListNode(2));
		l1.next.next.next =new ListNode(3);
		

		removeDuplicatedFromUnsortedListUsingSet(l1);
		LinkedList l = new LinkedList(); 
		l.setHead(l1);
		l.printList();
		System.out.println();
		removeDuplicatedFromUnsortedListWOtempBuffer(l1);
		LinkedList l2 = new LinkedList(); 
		l2.setHead(l1);
		l2.printList();	
	}
	
	/**
	 * Time complexity : O(n2)
	 * @param l1
	 * @return
	 * 
	 */
	private static ListNode removeDuplicatedFromUnsortedListWOtempBuffer(ListNode head) {
		
		ListNode curr = head;
		
		while(curr!=null) {
			ListNode res = curr;
			while(res.next!=null) {
				if(res.next.getData() == res.getData()) {
					res.next = res.next.next;
				}else {
					res = res.next;
				}
			}
			curr = curr.next;
		}
		
		return head;
	}
	
	/**
	 * Time complexity : O(n)
	 * @param l1
	 * @return
	 */
	private static ListNode removeDuplicatedFromUnsortedListUsingSet(ListNode head) {
		
	/*	if(head == null) {
			return head;
		}
		Set<Integer> set = new HashSet<Integer>();
		ListNode curr = head;
		ListNode prev = null;
		while(curr!=null) {
			
			if(set.contains(curr.getData())) {
				prev.next = curr.next;
			}else {
				set.add(curr.getData());
				prev = curr;
			}
			curr = curr.next;
			
		}
		
		return head;*/
		Set<Integer> set = new HashSet<Integer>();
		ListNode curr = head;
		ListNode prev = null;
		while(head!=null) {
			if(set.contains(curr.getData())) {
				prev.setNext(curr.getNext());
			}else {
				set.add(curr.getData());
				prev = curr;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}

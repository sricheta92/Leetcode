package com.easy.linkedlist;

public class KthNodeFromLast {
	public static void main(String[] args) {
		
		ListNode l1 = new ListNode(1);
		l1.setNext(new ListNode(2));
		l1.getNext().setNext(new ListNode(2));
		l1.next.next.next =new ListNode(3);
		findKthNodeFromLastIterative(l1,4);
		System.out.println(findKthNodeFromLastRecursive(l1,3));
	}

	private static int findKthNodeFromLastRecursive(ListNode l1, int k) {
		
		if(l1==null) {
			return 0;
		}
		int i =findKthNodeFromLastRecursive(l1.next, k)+1;
		if(i ==k) {
			return l1.getData();
		}
		return i;
	}

	private static void findKthNodeFromLastIterative(ListNode l1, int n) {
		
		int count =0;
		ListNode curr = l1;
		while(count!=n) {
			curr = curr.next;
			count++;
		}
		ListNode curr1 = l1;
		
		while(curr!=null) {
			curr = curr.next;
			curr1= curr1.next;
		}
		
		System.out.println(curr1.getData());
	}
}

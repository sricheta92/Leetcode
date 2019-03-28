package com.easy.linkedlist;

public class AddTwoNumbersII {

	static ListNode res = null;
	static ListNode prev = null;
	static ListNode curr  = null;
	private static int carry;
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.setNext(new ListNode(2));
		l1.getNext().setNext(new ListNode(5));

		ListNode l2 = new ListNode(3);
		l2.setNext(new ListNode(4));
		l2.getNext().setNext(new ListNode(2));
		l2.getNext().getNext().setNext(new ListNode(5));
		
		LinkedList list = new LinkedList();
		add(l1,l2);
		list.setHead(res);
		list.printList();
	}

	private static ListNode add(ListNode l1, ListNode l2) {
		
		int len1 = getLength(l1);
		int len2 = getLength(l2);
		
		if(len1 == len2) {
			addSameSize(l1,l2);
		}
		
		if(len1<len2) {
			ListNode temp = l1;
			l1 = l2;
			l2 = temp;
		}
		
		int diff = Math.abs(len1-len2);
		ListNode temp = l1;
		//ListNode curr = null;
		while(diff-->=0) {
			curr = temp;
			temp = temp.next;
		}
		addSameSize(curr, l2);
		propagateCarry(l1);
		
		if(carry>0) {
			ListNode node = new ListNode(carry);
			node.next = res; 
	        res = node; 
		}
		return res;
		
	}

	private static void propagateCarry(ListNode l1) {
		if(l1!=curr) {
			propagateCarry(l1.next);
			int sum = carry+l1.getData();
			carry = sum/10;
			sum = sum%10;
			ListNode node = new ListNode(sum);
			node.next = res; 
	        res = node; 
		}	
	}

	private static void addSameSize(ListNode l1, ListNode l2) {
		
		if(l1 == null) {
			return;
		}
		
		addSameSize(l1.next,l2.next);
		int sum = carry +l1.getData()+ l2.getData();
		carry = sum / 10;
		sum = sum % 10;
		ListNode node = new ListNode(sum);
		node.next = res; 
        res = node; 
		
	
	}

	private static int getLength(ListNode node) {
		int count = 0;
		ListNode curr = node;
		while(curr!=null) {
			curr = curr.next;
			count++;
		}
		
		return count;
		
	}
}

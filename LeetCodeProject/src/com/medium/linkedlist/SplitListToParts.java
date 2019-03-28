package com.medium.linkedlist;

import com.easy.linkedlist.LinkedList;
import com.easy.linkedlist.ListNode;

public class SplitListToParts {

	public static void main(String[] args) {
		LinkedList llist =new LinkedList();
		llist.setHead(new ListNode(1));
		llist.insertAtEnd(2);
		llist.insertAtEnd(3);
		llist.insertAtEnd(4);
		llist.insertAtEnd(5);
		llist.insertAtEnd(3);
		splitListToParts(llist.getHead(),2);
	}

	public static ListNode[] splitListToParts(ListNode root, int k) {
		if(root == null || k == 0){
			return null;
		}
		int count =0;
		ListNode curr = root;

		while(curr!=null){
			count++;
			curr = curr.next;
		}
		curr = root;
		ListNode res[] = new ListNode[k];
		int  i=0;
		if(count <=k){
			while(curr!=null) {
				res[i] = curr;
				curr = curr.next;
				i++;
			}

		}else {

			int subListCount = count/k;
			while(curr!=null) {
				ListNode sub = addInSublist(count, curr, subListCount);
				res[i] = sub;
				i++;
				curr = moveNextPointer(count, curr, subListCount);
			}

		}

		print(res);
		return res;
	}

	private static ListNode moveNextPointer(int count, ListNode curr, int subListCount) {
		
		int i =1;
		while(i!=subListCount && curr!=null) {
			curr = curr.next;
			i++;
		}
		return curr.next;
	}

	private static ListNode addInSublist(int count , ListNode curr, int subListCount) {
		ListNode curr1 = curr;
		int count1 = 1;
		while(count1!=subListCount && curr1!=null) {
			curr1 = curr1.next;
			count1++;
			
		}
		curr1.next = null;
		return curr1;
		
	}

	private static void print(ListNode[] res) {
		for(ListNode  node : res) {
			System.out.print(node!=null ? node.getData() : null +" ");
		}

	}
}

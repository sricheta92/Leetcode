package com.easy.linkedlist;

public class AddTwoNumbers {
	
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
		list.setHead(add(l1,l2));
		list.printList();
	}

	private static ListNode add(ListNode l1, ListNode l2) {
		 
        ListNode carry = null;
        ListNode res = null;
        ListNode res1 = res;
        ListNode prev = null;
        while(l1!=null || l2!=null){
            
            int one = (l1!= null) ? l1.getData() : 0;
            int two = (l2!= null) ? l2.getData() : 0;
            int carrydata =(carry!=null) ? carry.getData(): 0;
                
            int sum = one+ two+carrydata;
           
            carrydata = (sum >=10) ? 1 :0;
            carry = (carrydata == 1) ? new ListNode(carrydata) : null;
            sum = sum %10;
             System.out.println(sum);
            ListNode temp = new  ListNode(sum);
            if(res == null){
                res = temp;
            }else{
                prev.next = temp;
            }
            prev = temp;
            if(l1!= null){
                l1 = l1.next;
            }
            if(l2!= null){
                l2 = l2.next;
            }
        }
        
        if(carry!=null){
            prev.next = carry;
        }
        
        return res;
	}
}

package com.medium.stack;

import java.util.Iterator;
import java.util.Stack;

public class ReverseStack {
	static Stack<Integer> s = new Stack<Integer>();
	public static void main(String[] args) {
			
			s.push(1);
			s.push(2);
			s.push(3);
			s.push(4);
		
			printStack(s);
			System.out.println();
		//	Stack<Integer> s1 = reverseStack(s);
			 reverseStackRecursion();
		//	printStack(s1);
			 printStack(s);
//			//printStack(s2);
	}
	
	private static void reverseStackRecursion() {
		  if(s.size() > 0)
	        {
	             
	            // Hold all items in Function
	            // Call Stack until we
	            // reach end of the stack 
	            int x = s.peek();
	            s.pop();
	            reverseStackRecursion();
	             
	            // Insert all the items held 
	            // in Function Call Stack
	            // one by one from the bottom
	            // to top. Every item is
	            // inserted at the bottom 
	            insert_at_bottom(x);
	        }
	}

	private static void insert_at_bottom(int x) {
		 if(s.isEmpty())
	            s.push(x);
	 
	        else
	        {
	             
	            // All items are held in Function
	            // Call Stack until we reach end
	            // of the stack. When the stack becomes
	            // empty, the st.size() becomes 0, the
	            // above if part is executed and 
	            // the item is inserted at the bottom
	            int a = s.peek();
	            s.pop();
	            insert_at_bottom(x);
	 
	            // push allthe items held 
	            // in Function Call Stack
	            // once the item is inserted 
	            // at the bottom
	            s.push(a);
	        }
		
	}

	private static Stack<Integer> reverseStack(Stack<Integer> s) {
		Stack<Integer> res = new Stack<Integer>();
		
		while(!s.isEmpty()){
			
			int  temp = s.pop();
			res.push(temp);
			
		}
		return res;
		
	}

	private static void printStack(Stack<Integer> s) {
		Iterator<Integer> i = s.iterator();
		
		while(i.hasNext()) {
			System.out.print(i.next() + " ");
		}
		
	}

}

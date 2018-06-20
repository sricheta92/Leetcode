package com.easy.stack;

import java.util.Stack;

public class StockSpanProblem {
	
	public static void main(String[] args) {
		findSpan(new int[] {100, 80, 60, 70, 60, 75, 85});
		
		
	}

	private static void findSpan(int[] a) {
		
		int[] S = new int[a.length];
		Stack<Integer> st = new Stack<Integer>();
		st.push(0);
		S[0] = 1;
		
		for(int i =1;i<a.length;i++) {
			
			while(!st.isEmpty() && a[st.peek()]<=a[i]) {
				st.pop();
			}
			
			S[i] = st.isEmpty() ? i+1: i-st.peek();
			
			st.push(i);
			
		}
		
		for(Integer i : S) {
			System.out.print(i+ " ");
		}
		
	}

}
